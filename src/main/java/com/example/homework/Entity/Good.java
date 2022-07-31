package com.example.homework.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name="Customer_ID")
    private Customer customer_ID;
    private String name;
    private double capacity;
    private String measureUnits;
    private double weight;
    @ManyToMany
            //(mappedBy = "goods")
    @JoinTable(
            name = "goods_deliveries",
            joinColumns = @JoinColumn(name = "good_id"),
            inverseJoinColumns = @JoinColumn(name = "delivery_id")
    )
    private List<Delivery> deliveries;
}
