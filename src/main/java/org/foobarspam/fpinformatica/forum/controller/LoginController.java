package org.foobarspam.fpinformatica.forum.controller;

import org.foobarspam.fpinformatica.forum.Exceptions.UserNotFoundException;
import org.foobarspam.fpinformatica.forum.dto.UserDTO;
import org.foobarspam.fpinformatica.forum.entities.User;
import org.foobarspam.fpinformatica.forum.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class LoginController {

    private final UserRepository userRepository;

    @Autowired
    public LoginController(@Lazy UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @PostMapping("login")
    public User login(@Valid @RequestBody UserDTO dto) {
        if(userRepository.getUserByUsername(dto.getUsername())  != null) {
            return userRepository.getUserByUsername(dto.getUsername());
        }
        return null;
    }
}