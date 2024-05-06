package com.nadhem.users.service;

import com.nadhem.users.entities.Role;
import com.nadhem.users.entities.User;
import com.nadhem.users.service.register.RegistrationRequest;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
    User registerUser(RegistrationRequest request);
    void sendEmailUser(User u, String code);
    User validateToken(String code);
}

