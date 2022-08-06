package com.example.homework.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String conditions;
    @ManyToOne
    @JoinColumn(name="transporter_id")
    private Transporter transporter;
}
