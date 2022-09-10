package com.example.homework.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
@Accessors(chain = true)
@Data
public class CustomerDto {
    private Long id;
    private String name;
}
