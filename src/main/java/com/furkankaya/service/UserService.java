package com.furkankaya.service;

import com.furkankaya.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User createUser(User user);
    User updateUser(String firstName, User user);
    User findUserById(String firstName);
    List<User> getAllUser();
    Map<String, Boolean> deleteUser(String firstName);

}
