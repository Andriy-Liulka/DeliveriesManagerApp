package com.example.homework.Entity;

import com.example.homework.Entity.Embeddeds.UserData;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private UserData userData;
}
