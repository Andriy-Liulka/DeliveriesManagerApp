package com.example.homework.Services;

import com.example.homework.Entity.Offer;
import com.example.homework.Repository.OfferRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class OfferService {
    private OfferRepository offerRepository;
    public List<Offer> getAll() {
        return offerRepository.findAll();
    }

    public Offer get(long id) {
        try{
            return offerRepository.findById(id).orElseThrow(Exception::new);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void delete(long id) {
        offerRepository.deleteById(id);
    }

    public void create(Offer offer) {
        offerRepository.save(offer);
    }
}
