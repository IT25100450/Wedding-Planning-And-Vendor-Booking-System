package com.EternalBliss.EternalBliss.Service;

import com.EternalBliss.EternalBliss.model.login;
import com.EternalBliss.EternalBliss.repository.loginrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class loginservice {

    @Autowired
    private loginrepo repo;

    // ── Signup ─────────────────────────────────────
    public login register(login user) {
        if (repo.findByEmail(user.getEmail()) != null) {
            return null; // email already taken
        }
        if (user.getStatus() == null || user.getStatus().isEmpty()) {
            user.setStatus("Active");
        }
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("Guest");
        }
        return repo.save(user);
    }

    // ── Login ──────────────────────────────────────
    public login login(String email, String password) {
        login user = repo.findByEmail(email);
        if (user != null && user.getPassword() != null
                && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    // ── Get All Users (admin) ──────────────────────
    public List<login> getAllUsers() {
        return repo.findAll();
    }

    // ── Admin Create User ──────────────────────────
    public login createUser(login user) {
        if (repo.findByEmail(user.getEmail()) != null) {
            return null;
        }
        if (user.getStatus() == null || user.getStatus().isEmpty()) user.setStatus("Active");
        if (user.getRole()   == null || user.getRole().isEmpty())   user.setRole("Guest");
        return repo.save(user);
    }

    // ── Update User ────────────────────────────────
    public login updateUser(int id, login updated) {
        Optional<login> opt = repo.findById(id);
        if (opt.isEmpty()) return null;
        login user = opt.get();
        if (updated.getName()   != null) user.setName(updated.getName());
        if (updated.getEmail()  != null) user.setEmail(updated.getEmail());
        if (updated.getRole()   != null) user.setRole(updated.getRole());
        if (updated.getStatus() != null) user.setStatus(updated.getStatus());
        // Only update password if a new one is supplied
        if (updated.getPassword() != null && !updated.getPassword().isEmpty()) {
            user.setPassword(updated.getPassword());
        }
        return repo.save(user);
    }

    // ── Delete User ────────────────────────────────
    public boolean deleteUser(int id) {
        if (!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }
}