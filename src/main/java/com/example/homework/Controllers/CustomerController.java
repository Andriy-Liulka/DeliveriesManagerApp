package com.example.homework.Controllers;

import com.example.homework.Entity.Customer;
import com.example.homework.Services.CustomerService;
import com.example.homework.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping()
    public List<CustomerDto> getAll() {
        var data=customerService.getAll();
        return data;
    }

    @GetMapping("/{id}")
    public Customer get(@PathVariable long id) {
        return customerService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        customerService.delete(id);
    }

    @PostMapping()
    public void create(@RequestBody Customer customer) {
        customerService.create(customer);
    }

    @PutMapping()
    public void update(@RequestBody Customer customer) {
        customerService.update(customer);
    }
}