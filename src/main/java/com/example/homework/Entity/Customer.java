package com.example.homework.Entity;

import com.example.homework.Entity.Embeddeds.UserData;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="CUSTOMERS")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_ID;
    @Embedded
    private UserData userData;
}
