package com.example.homework.Services;


import com.example.homework.Entity.Customer;
import com.example.homework.Repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer get(long id) {
        try {
            return customerRepository.findById(id).orElseThrow(Exception::new);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public Customer create(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(long id) {
        customerRepository.deleteById(id);
    }

}
