package com.student.controller;

import com.student.dto.UserDto;
import com.student.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public void addUser(@RequestBody UserDto dto){
        userService.create(dto);
    }



}
