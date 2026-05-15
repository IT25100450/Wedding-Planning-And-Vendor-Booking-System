package com.EternalBliss.EternalBliss.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String name;
    private String password;
    private String role;
    private String status;
    private String email;

    // ── Getters & Setters ──────────────────────────
    public int getUser_id() { return user_id; }
    public void setUser_id(int user_id) { this.user_id = user_id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}