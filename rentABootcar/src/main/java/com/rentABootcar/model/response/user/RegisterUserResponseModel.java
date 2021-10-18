package com.rentABootcar.model.response.user;

/**
 * Project rentABootcar, Package com.rentABootcar.model.response, Class RegisterUserResponseModel, Created by Milovan 10.10.2021.
 */
public class RegisterUserResponseModel {
    private boolean successful;
    private String message;

    public RegisterUserResponseModel(boolean successful, String message) {
        this.successful = successful;
        this.message = message;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getMessage() {
        return message;
    }
}

