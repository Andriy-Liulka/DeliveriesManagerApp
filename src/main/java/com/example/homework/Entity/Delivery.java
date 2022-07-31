package com.example.homework.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name="deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
            //(mappedBy = "deliveries")
    private List<Good> goods;

}
