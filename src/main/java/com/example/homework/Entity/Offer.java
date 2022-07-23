package com.example.homework.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="OFFERS")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int offer_ID;
    private String conditions;
    @ManyToOne
    @JoinColumn(name="transporter_ID")
    private Transporter transporter;
}
