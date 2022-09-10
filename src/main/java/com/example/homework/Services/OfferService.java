package com.example.homework.Services;

import com.example.homework.Entity.Good;
import com.example.homework.Entity.Offer;
import com.example.homework.Repository.OfferRepository;
import com.example.homework.dto.OfferDto;
import com.example.homework.map.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class OfferService {
    private OfferRepository offerRepository;
    private final MainMapper mapper;
    public List<OfferDto> getAll() {
        return offerRepository.findAll().stream().map(mapper::toOfferDto).toList();
    }

    public Offer get(long id) {
        try {
            return offerRepository.findById(id).orElseThrow(Exception::new);
        } catch (Exception ex) {
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

    public Offer update(Offer offer) {return offerRepository.save(offer);}
}