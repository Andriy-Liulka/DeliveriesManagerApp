package com.example.homework.Services;

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
}
