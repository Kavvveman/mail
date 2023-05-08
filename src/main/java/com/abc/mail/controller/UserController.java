package com.abc.mail.controller;

// import com.abc.mailbookingsystem.Dto.TokenDto;
// import com.faboda.bookingsystem.Dto.UserLoginDto;
import com.abc.mail.model.*;
import com.abc.mail.Repositories.*;
import  com.abc.mail.controller.*;
import  com.abc.mail.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1")
public class UserController {
    
    @Autowired
    UserDetailService userDetailService;
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/auth/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        userDetailService.saveUser(user);
        return ResponseEntity.ok("Dpme");
    }

    

}