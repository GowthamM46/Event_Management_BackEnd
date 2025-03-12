//package com.web.service;
//
//import java.util.Optional;
//
//import com.web.entity.User;
//
//public interface UserService {
//	
//	    User getUser(Integer id);
//	    User insertUser(User user);
//	    User getUserByEmail(String email);
//	    User loginUser(User user);  // Add this method
//	
//
//
//
//}




package com.web.service;

import com.web.entity.User;

public interface UserService {
    User insertUser(User user);
    User getUser(Integer id);
}
