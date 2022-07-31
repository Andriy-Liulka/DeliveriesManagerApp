package com.example.homework.Services;

import com.example.homework.Entity.Good;
import com.example.homework.Repository.GoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class GoodService {
    private GoodRepository goodRepository;
    public List<Good> getAll() {
        return goodRepository.findAll();
    }

    public Good get(long id) {
        try{
            return goodRepository.findById(id).orElseThrow(Exception::new);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void delete(long id) {
        goodRepository.deleteById(id);
    }

    public void create(Good good) {
        goodRepository.save(good);
    }
}
