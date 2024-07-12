package com.lcwd.user.service.controllers;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    //create user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1= userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //single users
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
        User user=userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    //all users
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> allUser=userService.getAllUsers();
        return ResponseEntity.ok(allUser);
    }
}
