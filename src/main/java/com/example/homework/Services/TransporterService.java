package com.example.homework.Services;

import com.example.homework.Entity.Offer;
import com.example.homework.Entity.Transporter;
import com.example.homework.Repository.TransportedRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class TransporterService {
    private TransportedRepository transporterRepository;

    public List<Transporter> getAll() {
        return transporterRepository.findAll();
    }

    public Transporter get(long id) {
        try {
            return transporterRepository.findById(id).orElseThrow(Exception::new);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void delete(long id) {
        transporterRepository.deleteById(id);
    }

    public void create(Transporter transporter) {
        transporterRepository.save(transporter);
    }
}

