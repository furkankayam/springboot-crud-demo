package com.furkankaya.controller;

import com.furkankaya.model.User;
import com.furkankaya.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    //LIST
    // http://localhost:8080/api/v1/users
    @GetMapping({"","/"})
    public ResponseEntity<List<User>> getUser() {
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
    }

    //FIND
    // http://localhost:8080/api/v1/users/furkan
    @GetMapping("/{firstName}")
    public ResponseEntity<User> findCustomerById(@PathVariable String firstName) {
        return new ResponseEntity<>(userService.findUserById(firstName), HttpStatus.OK);
    }

    //CREATE
    // http://localhost:8080/api/v1/users
    @PostMapping({"","/"})
    public ResponseEntity<User> createUser(
            @RequestBody User user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    //UPDATE
    // http://localhost:8080/api/v1/users/furkan
    @PutMapping("/{firstName}")
    public ResponseEntity<User> updateUser(@PathVariable String firstName,
                                                                  @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(firstName, user), HttpStatus.OK);
    }

    //DELETE
    // http://localhost:8080/api/v1/users/furkan
    @DeleteMapping("/{firstName}")
    public ResponseEntity<Map<String, Boolean>> deleteCustomer(@PathVariable String firstName) {
        return  new ResponseEntity<>(userService.deleteUser(firstName), HttpStatus.OK);
    }

}
