package com.example.homework.Entity;

import com.example.homework.Entity.Embeddeds.UserData;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="TRANSPORTERS")
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transporter_ID;
    @Embedded
    private UserData userData;
}
