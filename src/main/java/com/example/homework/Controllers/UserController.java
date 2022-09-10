package com.example.homework.Controllers;

import com.example.homework.Services.GoodService;
import com.example.homework.Services.UserService;
import com.example.homework.dto.CustomerDto;
import com.example.homework.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping()
    public List<UserDto> getAll() {
       return userService.getAll();
    }
}
