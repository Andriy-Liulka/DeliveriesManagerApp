package com.example.homework.Entity;

import com.example.homework.Enums.Role;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @Column(columnDefinition = "boolean default true")
    private boolean activated;
    @Column(columnDefinition = "boolean default false")
    private boolean disabled;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne(optional = true)
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @OneToOne(optional = true)
    @JoinColumn(name = "transporter_id")
    private Transporter transporter;
}
