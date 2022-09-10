package com.example.homework.Controllers;

import com.example.homework.Entity.Offer;
import com.example.homework.Entity.Transporter;
import com.example.homework.Services.TransporterService;
import com.example.homework.dto.TransporterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/transporters")
@RequiredArgsConstructor
public class TransporterController {
    private final TransporterService transporterService;

    @GetMapping()
    public List<TransporterDto> getAll()
    {
     try{
         return transporterService.getAll();
     }
       catch(Exception ex){
         System.out.println(ex.getMessage());
         return new ArrayList<TransporterDto>();
       }
    }

    @GetMapping("/{id}")
    public Transporter get(@PathVariable long id) {
        return transporterService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        transporterService.delete(id);
    }

    @PostMapping()
    public void create(@RequestBody Transporter transporter) {
        transporterService.create(transporter);
    }

    @PutMapping()
    public void update(@RequestBody Transporter transporter) {
        transporterService.update(transporter);
    }
}

