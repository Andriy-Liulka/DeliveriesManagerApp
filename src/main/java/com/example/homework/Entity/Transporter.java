package com.example.homework.Entity;

import com.example.homework.Entity.Embeddeds.UserData;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="transporters")
public class Transporter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private UserData userData;
}
