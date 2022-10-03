package com.example.pp311_1.service;

import com.example.pp311_1.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    void deleteUser(Long id);

    void saveUser(User user);

    List<User> getUsers();

    public void editUser(User user);
}
