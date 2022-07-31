package com.example.homework.Services;

import com.example.homework.Entity.Customer;
import com.example.homework.Entity.Delivery;
import com.example.homework.Repository.DeliveryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class DeliveryService {
    private DeliveryRepository deliveryRepository;
    public List<Delivery> getAll() {return deliveryRepository.findAll();}

    public Delivery get(long id) {
        try{
            return deliveryRepository.findById(id).orElseThrow(Exception::new);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void delete(long id) {
        deliveryRepository.deleteById(id);
    }

    public void create(Delivery delivery) {
        deliveryRepository.save(delivery);
    }
}
