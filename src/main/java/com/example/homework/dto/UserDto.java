package com.example.homework.dto;

import com.example.homework.Entity.Customer;
import com.example.homework.Entity.Transporter;
import com.example.homework.Enums.Role;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class UserDto {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean activated;
    private boolean disabled;
    private Role role;
    private CustomerDto customer;
    private TransporterDto transporter;
}
