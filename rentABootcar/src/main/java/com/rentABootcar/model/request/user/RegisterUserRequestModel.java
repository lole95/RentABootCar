package com.rentABootcar.model.request.user;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response, Class RegisterUserRequestModel, Created by Milovan 10.10.2021.
 */
public class RegisterUserRequestModel {

    private String username, email, password;

    public RegisterUserRequestModel(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
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
}

