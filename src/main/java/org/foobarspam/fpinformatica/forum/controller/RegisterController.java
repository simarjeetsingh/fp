package org.foobarspam.fpinformatica.forum.controller;

import org.foobarspam.fpinformatica.forum.dto.UserDTO;
import org.foobarspam.fpinformatica.forum.entities.User;
import org.foobarspam.fpinformatica.forum.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class RegisterController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegisterController(@Lazy UserRepository userRepository, @Lazy PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @PostMapping("register")
    public String registerUser(@Valid @RequestBody UserDTO dto) {
        User user = new User();
        if (userRepository.getUserByUsername(dto.getUsername()) == null) {
            user.setUsername(dto.getUsername());
//            if (Objects.equals(dto.getIntroduction(), ""))
//                user.setIntroduction(null);
//            else
//            user.setIntroduction(dto.getIntroduction());
            user.setPassword(passwordEncoder.encode(dto.getPassword()));
            user.setCreatedDate(LocalDateTime.now());
            userRepository.save(user);
            return "user successfully added";
        } else
            return "something went wrong";
    }
}