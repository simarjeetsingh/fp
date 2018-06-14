package org.foobarspam.fpinformatica.forum.service;

import org.foobarspam.fpinformatica.forum.entities.User;
import org.foobarspam.fpinformatica.forum.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public void create(User user) {
//        user.setUsername(username);
//        if (Objects.equals(introduction, ""))
//            user.setIntroduction(null);
//        else
//            user.setIntroduction(introduction);
//        user.setPassword(passwordEncoder.encode(password));
//        user.setCreatedDate(LocalDateTime.now());
//        userRepository.save(user);
//    }
}
