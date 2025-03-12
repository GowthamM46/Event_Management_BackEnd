//package com.web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import com.web.entity.User;
//import com.web.service.UserService;
//
//@RestController
//@RequestMapping("/user")
//public class UserController {
//
//    @Autowired
//    private UserService service;
//
//    public UserController(UserService service) {
//        this.service = service;
//    }
//
//    // Get user by ID
//    @GetMapping("/get/{id}")
//    public ResponseEntity<?> getUser(@PathVariable Integer id) {
//        User user = service.getUser(id);
//        if (user != null) {
//            return ResponseEntity.ok(user);
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
//        }
//    }
//
//    // User Registration
//    @PostMapping("/insert")
//    public ResponseEntity<?> registerUser(@RequestBody User user) {
//        // Ensure password and confirmPassword match
//        if (!user.getPassword().equals(user.getConfirmPassword())) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Passwords do not match");
//        }
//        User savedUser = service.loginUser(user);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
//    }
//
//    // User Login
//    @PostMapping("/login")
//    public ResponseEntity<?> loginUser(@RequestBody User user) {
//        User existingUser = service.getUserByEmail(user.getEmail());
//
//        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
//            return ResponseEntity.ok(existingUser);  // Login successful
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
//        }
//    }
//}




package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.web.entity.User;
import com.web.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from frontend
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {
        User existingUser = service.insertUser(user.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return existingUser; // Successful login
        } else {
            throw new RuntimeException("Invalid email or password");
        }
    }


    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Integer id) {
        return service.getUser(id); // Fetch user from DB
    }
}
