package com.uralhalil.jte.demo;

import org.springframework.stereotype.Service;

@Service
public class UserProfileRepository {
    private UserProfile userProfile;

    // Save the user profile data
    public void save(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    // Retrieve the saved user profile data
    public UserProfile get() {
        return this.userProfile;
    }

    // Check if a user profile exists
    public boolean exists() {
        return this.userProfile != null;
    }
}