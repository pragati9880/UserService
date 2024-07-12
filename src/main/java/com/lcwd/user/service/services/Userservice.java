package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface Userservice {

    //user operations

    //create user
    User saveUser(User user);

    //get all users
    List<User> getAllUsers();

    //get single user
    User getUser(String userId);
}
