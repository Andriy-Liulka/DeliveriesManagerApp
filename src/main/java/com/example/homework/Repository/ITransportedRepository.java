package com.example.homework.Repository;
import com.example.homework.Entity.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransportedRepository extends JpaRepository<Transporter, Long> {
}
