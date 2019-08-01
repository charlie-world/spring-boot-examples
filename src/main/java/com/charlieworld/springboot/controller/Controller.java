package com.charlieworld.springboot.controller;

import com.charlieworld.springboot.dto.UserDto;
import com.charlieworld.springboot.entity.User;
import com.charlieworld.springboot.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
public class Controller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    private List<UserDto> getUsers() {

        User user = new User();
        user.setName("John");

        userRepository.save(user);

        List<User> users = userRepository.findAll();
        return users
                .stream()
                .map(u -> new UserDto(u.getUserId(), u.getName()))
                .collect(Collectors.toList());
    }
}
