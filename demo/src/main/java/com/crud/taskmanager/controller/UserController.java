package com.crud.taskmanager.controller;

import com.crud.taskmanager.dto.userDTO.UserRequestDto;
import com.crud.taskmanager.dto.userDTO.UserResponseDTO;
import com.crud.taskmanager.entity.User;
import com.crud.taskmanager.service.userservice.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
        public void createUser(@RequestBody UserRequestDto requestDto){
            userService.save(requestDto);
    }


    @GetMapping("/{id}")
        public UserResponseDTO getUserById(@PathVariable Long id){
                return userService.findById(id);
    }

    @GetMapping
        public List<User> getUsers(){
                return userService.findAll();
    }


    @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable Long id){
             userService.delete(id);
    }
}
