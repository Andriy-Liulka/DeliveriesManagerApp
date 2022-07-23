package com.example.homework.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="GOODS")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int object_Id;
    @ManyToOne(optional = false)
    @JoinColumn(name="Customer_ID")
    private Customer customer_ID;
    private double capacity;
    private String measureUnits;
    private double weight;
    @ManyToMany
            //(mappedBy = "GOOD")
    private List<Delivery> deliveries;
}
