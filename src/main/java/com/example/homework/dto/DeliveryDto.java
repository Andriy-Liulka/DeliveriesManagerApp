package com.example.homework.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;
@Accessors(chain = true)
@Data
public class DeliveryDto {
    private Long id;
    private String source;
    private String destination;
    private double capacity;
    private Date creationDate;
    private Date departureDate;
    private Date receivingDate;
    private double price;
    private String state;
    private boolean isPaid;
    private TransporterDto transporter;
    private List<GoodDto> goods;

}
