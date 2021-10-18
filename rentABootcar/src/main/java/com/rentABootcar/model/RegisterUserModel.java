package com.rentABootcar.model;

import java.util.UUID;

/**
 * Project rentABootcar, Package com.rentABootcar.model, Class RegisterUserModel, Created by Milovan 12.10.2021.
 */
public class RegisterUserModel {
    private UUID id;
    private String username, email, password;
    private boolean admin;

    public RegisterUserModel(String username, String email, String password) {
        this.id  = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.password = password;
        this.admin = false;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return admin;
    }
}

