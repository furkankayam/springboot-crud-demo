package com.furkankaya.service.impl;

import com.furkankaya.model.User;
import com.furkankaya.repository.UserRepository;
import com.furkankaya.service.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(String firstName, User user) {
        User user1 = userRepository.getUserById(firstName);
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEmail(user.getEmail());
        userRepository.save(user1);
        return user;
    }

    @Override
    public User findUserById(String firstName) {
        return userRepository.getUserById(firstName);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Map<String, Boolean> deleteUser(String firstName) {
        userRepository.delete(userRepository.getUserById(firstName));
        Map<String, Boolean> temp = new HashMap<>();
        temp.put("Delete: " , true);
        return temp;
    }
}
