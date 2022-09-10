package com.example.homework.Controllers;

import com.example.homework.Entity.Customer;
import com.example.homework.Entity.Good;
import com.example.homework.Services.GoodService;
import com.example.homework.dto.GoodDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/goods")
@RequiredArgsConstructor
public class GoodController {
    private final GoodService goodService;

    @GetMapping()
    public List<GoodDto> getAll() {
        return goodService.getAll();
    }

    @GetMapping("/{id}")
    public Good get(@PathVariable long id) {
        return goodService.get(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        goodService.delete(id);
    }

    @PostMapping()
    public void create(@RequestBody Good delivery) {
        goodService.create(delivery);
    }

    @PutMapping()
    public void update(@RequestBody Good delivery) {
        goodService.update(delivery);
    }
}
