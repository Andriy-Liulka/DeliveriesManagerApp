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
    private Date creationDate;
    private Date departureDate;
    private Date receivingDate;
    private double price;
    private String state;
    private boolean isPaid;
    @ManyToOne(optional = false)
    @JoinColumn(name="transporter_id")
    private Transporter transporter;
    @ManyToMany(mappedBy = "deliveries", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Good> goods;

}
