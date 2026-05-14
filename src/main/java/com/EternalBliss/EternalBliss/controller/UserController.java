package com.EternalBliss.EternalBliss.controller;

import com.EternalBliss.EternalBliss.Service.loginservice;
import com.EternalBliss.EternalBliss.model.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private loginservice service;

    // ── SIGNUP ─────────────────────────────────────────────────
    // POST /api/signup
    // Body: { "name":"...", "email":"...", "password":"...", "role":"...", "status":"..." }
    @PostMapping("/signup")
    public ResponseEntity<String> register(@RequestBody login user) {
        login saved = service.register(user);
        if (saved == null) {
            return ResponseEntity.badRequest().body("Email already registered. Please sign in.");
        }
        return ResponseEntity.ok("Account created successfully");
    }

    // ── LOGIN ───────────────────────────────────────────────────
    // POST /api/login
    // Body: { "email":"...", "password":"..." }
    // Returns JSON: { "role":"Admin", "name":"John Doe", "email":"...", "user_id": 1 }
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody login request) {
        login loggedUser = service.login(request.getEmail(), request.getPassword());

        if (loggedUser != null) {
            Map<String, Object> response = new HashMap<>();
            response.put("role",    loggedUser.getRole());
            response.put("name",    loggedUser.getName());
            response.put("email",   loggedUser.getEmail());
            response.put("user_id", loggedUser.getUser_id());
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body(null);
        }
    }

    // ── GET ALL USERS (admin) ───────────────────────────────────
    // GET /api/users
    @GetMapping("/users")
    public ResponseEntity<List<login>> getAllUsers() {
        return ResponseEntity.ok(service.getAllUsers());
    }

    // ── ADMIN CREATE USER ───────────────────────────────────────
    // POST /api/users
    // Body: { "name":"...", "email":"...", "password":"...", "role":"...", "status":"..." }
    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody login user) {
        login saved = service.createUser(user);
        if (saved == null) {
            return ResponseEntity.badRequest().body("Email already exists.");
        }
        return ResponseEntity.ok("User created successfully");
    }

    // ── UPDATE USER ─────────────────────────────────────────────
    // PUT /api/users/{id}
    @PutMapping("/users/{id}")
    public ResponseEntity<String> updateUser(@PathVariable int id, @RequestBody login updated) {
        login result = service.updateUser(id, updated);
        if (result == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("User updated successfully");
    }

    // ── DELETE USER ─────────────────────────────────────────────
    // DELETE /api/users/{id}
    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        boolean deleted = service.deleteUser(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("User deleted successfully");
    }
}