package com.example.homework.Services;


import com.example.homework.Entity.Customer;
import com.example.homework.Repository.ICustomerRepository;
//import com.example.homework.Repository.IRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CustomerService {
    //private IRepository<Customer,Long> customerRepository;
    private ICustomerRepository customerRepository;
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

}
