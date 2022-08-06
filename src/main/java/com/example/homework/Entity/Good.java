package com.example.homework.Entity;

import com.example.homework.Enums.VolumeUnit;
import com.example.homework.Enums.WeightUnit;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name="customer_Id")
    private Customer customer;
    private String name;
    private Double weight;
    private Double volume;
    @Enumerated(EnumType.STRING)
    private WeightUnit weightUnit;
    @Enumerated(EnumType.STRING)
    private VolumeUnit volumeUnit;
    @ManyToMany
    @JoinTable(
            name = "goods_deliveries",
            joinColumns = @JoinColumn(name = "good_id"),
            inverseJoinColumns = @JoinColumn(name = "delivery_id")
    )
    private List<Delivery> deliveries;
}
