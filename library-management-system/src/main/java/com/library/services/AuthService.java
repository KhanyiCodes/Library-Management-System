package com.library.services;

import com.library.models.User;
import com.library.models.Role;

import java.util.HashMap;
import java.util.Map;

public class AuthService {
    private Map<String, User> userDatabase = new HashMap<>();

    public AuthService() {
        // Initialize with some default users
        userDatabase.put("admin", new User("admin", "admin123", Role.ADMIN));
        userDatabase.put("librarian", new User("librarian", "lib123", Role.LIBRARIAN));
        userDatabase.put("member", new User("member", "mem123", Role.MEMBER));
    }

    public User login(String username, String password) {
        User user = userDatabase.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public void logout(User user) {
        // Logic for logout can be implemented here
    }

    public boolean register(User user) {
        if (!userDatabase.containsKey(user.getUsername())) {
            userDatabase.put(user.getUsername(), user);
            return true;
        }
        return false;
    }
}