package com.example.homework.Services;

import com.example.homework.Entity.Delivery;
import com.example.homework.Entity.Good;
import com.example.homework.Repository.GoodRepository;
import com.example.homework.dto.GoodDto;
import com.example.homework.map.MainMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class GoodService {
    private GoodRepository goodRepository;
    private final MainMapper mapper;
    public List<GoodDto> getAll() {
        return goodRepository.findAll().stream().map(mapper::toGoodDto).toList();
    }

    public Good get(long id) {

        try {
            return goodRepository.findById(id).orElseThrow(Exception::new);
        } catch (Exception ex) {
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

    public Good update(Good good) {return goodRepository.save(good);}
}
