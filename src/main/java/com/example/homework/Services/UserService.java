package com.example.homework.Services;

import com.example.homework.Entity.Offer;
import com.example.homework.Entity.User;
import com.example.homework.Repository.CustomerRepository;
import com.example.homework.Repository.UserRepository;
import com.example.homework.dto.TransporterDto;
import com.example.homework.dto.UserDto;
import com.example.homework.map.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private final MainMapper mapper;

    public List<UserDto> getAll() {
        return userRepository.findAll().stream().map(mapper::toUserDto).toList();
    }

    public void create(User user) {
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).get();
        //return userRepository.findByEmailUser(email);
    }
}
