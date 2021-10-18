package com.rentABootcar.model.request.user;

/**
 * Project rentABootcar, Package com.rentABootcar.model.request, Class LoginUserRequestModel, Created by Milovan 10.10.2021.
 */
public class LoginUserRequestModel {
    private String identification;
    private String password;

    public LoginUserRequestModel(String identification, String password) {
        this.identification = identification;
        this.password = password;
    }

    public String getIdentification() {
        return identification;
    }

    public String getPassword() {
        return password;
    }
}

