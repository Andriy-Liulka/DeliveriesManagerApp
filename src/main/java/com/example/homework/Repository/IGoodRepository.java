package com.example.homework.Repository;

import com.example.homework.Entity.Good;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGoodRepository extends JpaRepository<Good, Long> {
}
