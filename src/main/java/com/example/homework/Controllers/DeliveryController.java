package com.example.homework.Controllers;

import com.example.homework.Entity.Customer;
import com.example.homework.Entity.Delivery;
import com.example.homework.Services.DeliveryService;
import com.example.homework.dto.DeliveryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/deliveries")
@RequiredArgsConstructor
public class DeliveryController {
    private final DeliveryService deliveryService;

    @GetMapping()
    public List<DeliveryDto> getAll() {
        return deliveryService.getAll();
    }

    @GetMapping("/{id}")
    public Delivery get(@PathVariable long id) {
        return deliveryService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        deliveryService.delete(id);
    }

    @PostMapping()
    public void create(@RequestBody Delivery delivery) {
        deliveryService.create(delivery);
    }

    @PutMapping()
    public void update(@RequestBody Delivery delivery) {
        deliveryService.update(delivery);
    }
}
