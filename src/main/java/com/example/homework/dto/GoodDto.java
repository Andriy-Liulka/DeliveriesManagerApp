package com.example.homework.dto;

import com.example.homework.Entity.Customer;
import com.example.homework.Enums.VolumeUnit;
import com.example.homework.Enums.WeightUnit;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;
@Accessors(chain = true)
@Data
public class GoodDto {
    private Long id;
    private Customer customer;
    private String name;
    private Double weight;
    private Double volume;
    private WeightUnit weightUnit;
    private VolumeUnit volumeUnit;
}
