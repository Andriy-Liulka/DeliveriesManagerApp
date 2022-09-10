package com.example.homework.Services;


import com.example.homework.Entity.Customer;
import com.example.homework.Repository.CustomerRepository;
import com.example.homework.dto.CustomerDto;
import com.example.homework.map.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;
    private final MainMapper mapper;
    public List<CustomerDto> getAll() {
        try{
            var data=customerRepository.findAll().stream().map(mapper::toCustomerDto).toList();
            return data;
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return new ArrayList<CustomerDto>();
        }

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

    public Customer update(Customer customer) {return customerRepository.save(customer);}

}
