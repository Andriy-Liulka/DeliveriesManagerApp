package com.example.homework.Entity.Embeddeds;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class UserData {
    private String name;
    private String surname;
}
