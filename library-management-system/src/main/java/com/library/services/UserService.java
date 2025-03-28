package com.library.services;

import com.library.models.User;
import com.library.models.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {
    private List<User> users = new ArrayList<>();

    public User registerUser(String username, String password, Role role) {
        User user = new User(username, password, role);
        users.add(user);
        return user;
    }

    public Optional<User> authenticateUser(String username, String password) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password))
                .findFirst();
    }

    public void assignRole(User user, Role role) {
        user.setRole(role);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}