package com.noranekoit.crud.simpleCrud.service;

import com.noranekoit.crud.simpleCrud.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User getUserById(int userId);
    void updateUser(User user);
    void deleteUserById(int userId);
    List<User> getAllUsers();
}
