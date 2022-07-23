package com.example.homework.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="DELIVERIES")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int delivery_ID;
    private String source;
    private String destination;
    private double capacity;
    private Date dateCreate;
    private Date dateOfSending;
    private Date dateOfDelivery;
    private double price;
    private String state;
    private boolean isPaid;
    @ManyToOne(optional = false)
    @JoinColumn(name="transporter_ID")
    private Transporter transporter_ID;
    @ManyToMany
            //(mappedBy = "DELIVERY")
    private List<Good> goods;

}
