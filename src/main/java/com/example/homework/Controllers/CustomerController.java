package com.example.homework.Controllers;

import com.example.homework.Entity.Customer;
import com.example.homework.Services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customers")
public class CustomerController {
    private final CustomerService customerService;
    public List<Customer> getAll(){
        return customerService.getAll();
    }
}
