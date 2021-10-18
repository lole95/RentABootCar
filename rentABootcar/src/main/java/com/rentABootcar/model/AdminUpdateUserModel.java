package com.rentABootcar.model;

/**
 * Project rentABootcar, Package com.rentABootcar.model, Class AdminUpdateUserModel, Created by Milovan 12.10.2021.
 */
public class AdminUpdateUserModel {
    private String username, email, firstName, lastName, phoneNumber, personalNumber, image;

    public AdminUpdateUserModel(String username, String email, String firstName, String lastName,
                                String phoneNumber, String personalNumber, String image) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.personalNumber = personalNumber;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getImage() {
        return image;
    }
}

