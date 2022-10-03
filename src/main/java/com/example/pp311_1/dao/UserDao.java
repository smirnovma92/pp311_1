package com.example.pp311_1.dao;

import com.example.pp311_1.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void deleteUser(Long id);

    User findById(Long id);

    List<User> getUsers();

    public void editUser(User user);
}
