package com.example.homework.Controllers;

import com.example.homework.Entity.Good;
import com.example.homework.Entity.Offer;
import com.example.homework.Services.GoodService;
import com.example.homework.Services.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/offers")
@RequiredArgsConstructor
public class OfferController {
    private final OfferService offerService;
    @GetMapping()
    public List<Offer> getAll(){
        return offerService.getAll();
    }
    @GetMapping("/{id}")
    public Offer get(@PathVariable long id){
        return offerService.get(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        offerService.delete(id);
    }
    @PostMapping()
    public void create(@RequestBody Offer offer){
        offerService.create(offer);
    }
}
