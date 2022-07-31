package com.example.homework.Controllers;

import com.example.homework.Entity.Good;
import com.example.homework.Services.GoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/goods")
@RequiredArgsConstructor
public class GoodController {
    private final GoodService goodService;
    @GetMapping()
    public List<Good> getAll(){
        return goodService.getAll();
    }
    @GetMapping("/{id}")
    public Good get(@PathVariable long id){
        return goodService.get(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        goodService.delete(id);
    }
    @PostMapping()
    public void create(@RequestBody Good good){
        goodService.create(good);
    }
}
