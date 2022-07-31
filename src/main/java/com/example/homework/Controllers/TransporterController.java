package com.example.homework.Controllers;

import com.example.homework.Entity.Offer;
import com.example.homework.Entity.Transporter;
import com.example.homework.Services.OfferService;
import com.example.homework.Services.TransporterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/transporters")
@RequiredArgsConstructor
public class TransporterController {
    private final TransporterService transporterService;
    @GetMapping()
    public List<Transporter> getAll(){
        return transporterService.getAll();
    }
    @GetMapping("/{id}")
    public Transporter get(@PathVariable long id){
        return transporterService.get(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        transporterService.delete(id);
    }
    @PostMapping()
    public void create(@RequestBody Transporter transporter){
        transporterService.create(transporter);
    }
}
