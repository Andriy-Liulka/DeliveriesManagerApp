package com.example.homework.Services;

import com.example.homework.Entity.Offer;
import com.example.homework.Entity.Transporter;
import com.example.homework.Repository.TransportedRepository;
import com.example.homework.dto.TransporterDto;
import com.example.homework.map.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class TransporterService {
    private TransportedRepository transporterRepository;
    private final MainMapper mapper;
    public List<TransporterDto> getAll() {
        return transporterRepository.findAll().stream().map(mapper::toTransporterDto).toList();
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

    public Transporter update(Transporter transporter) {return transporterRepository.save(transporter);}
}

