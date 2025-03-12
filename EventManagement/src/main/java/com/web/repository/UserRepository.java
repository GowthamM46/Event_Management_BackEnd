//package com.web.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.web.entity.User;
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Integer> {
//    User findByEmail(String email);  // This is necessary
//
//
//}



package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.web.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email); // To fetch a user by email
}
