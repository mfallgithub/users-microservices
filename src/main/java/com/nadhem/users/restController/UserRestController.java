package com.nadhem.users.restController;

import com.nadhem.users.entities.User;
import com.nadhem.users.service.UserService;
import com.nadhem.users.service.register.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("/register")
    public User register(@RequestBody RegistrationRequest request) {
        return userService.registerUser(request);
    }

    @GetMapping("/verifyEmail/{token}")
    public User verifyEmail(@PathVariable("token") String token){
        return userService.validateToken(token);
    }

}
