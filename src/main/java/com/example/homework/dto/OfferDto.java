package com.example.homework.dto;

import lombok.*;
import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class OfferDto {
    private Long id;
    private String conditions;
    private TransporterDto transporter;
}
