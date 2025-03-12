//package com.web.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.web.entity.User;
//import com.web.repository.UserRepository;
//
//import lombok.NoArgsConstructor;
//
//@Service
//public class UserImpl implements UserService {
//
//    @Autowired
//    private UserRepository rep;
//
//    @Override
//    public User getUser(Integer id) {
//        return rep.findById(id).orElse(null);
//    }
//
//    @Override
//    public User insertUser(User user) {
//        return rep.save(user);
//    }
//
//    @Override
//    public User getUserByEmail(String email) {
//        return rep.findByEmail(email);
//    }
//
//    @Override
//    public User loginUser(User user) {  // Implementing loginUser
//        User existingUser = rep.findByEmail(user.getEmail());
//        
//        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
//            return existingUser;  // User found, return user details
//        }
//        return null; // Return null if login fails
//    }
//}
//
//
//
//       
//       
//





package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.entity.User;
import com.web.repository.UserRepository;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User insertUser(User user) {
        return userRepository.save(user); // Saves user in DB
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).orElse(null); // Fetch user by ID
    }
}
