package com.crudpratices.crudpratices.service;

import java.util.List;
import java.util.Optional;

import com.crudpratices.crudpratices.entiy.User;

public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(String id);
    // User getUserById(String id);
    User updateUser( String id,User user);
    void deleteUser(String id);

    

}
