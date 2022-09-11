package com.example.homework.Controllers;

import com.example.homework.Entity.Transporter;
import com.example.homework.Entity.User;
import com.example.homework.Services.GoodService;
import com.example.homework.Services.UserService;
import com.example.homework.dto.CustomerDto;
import com.example.homework.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/register")
    public void create(@RequestBody User user) {
        userService.create(user);
    }

    @GetMapping("/findForEmail")
    public User findForEmail(@RequestParam String email) {
        return userService.findByEmail(email);
    }
}
