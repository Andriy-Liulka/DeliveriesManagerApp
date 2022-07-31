package com.example.homework.Controllers;

import com.example.homework.Entity.Customer;
import com.example.homework.Services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customers")
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping()
    public List<Customer> getAll(){
        return customerService.getAll();
    }
    @GetMapping("/{id}")
    public Customer get(@PathVariable long id){
        return customerService.get(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        customerService.delete(id);
    }
    @PostMapping()
    public void create(@RequestBody Customer customer){
        customerService.create(customer);
    }
}
