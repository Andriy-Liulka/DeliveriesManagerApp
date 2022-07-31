package com.example.homework.Repository;
import com.example.homework.Entity.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportedRepository extends JpaRepository<Transporter, Long> {
}
