package com.uralhalil.jte.demo;

public class UserProfile {
    private String name;
    private String surname;
    private String email;

    public UserProfile(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

}