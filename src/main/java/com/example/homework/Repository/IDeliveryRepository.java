package com.example.homework.Repository;
import com.example.homework.Entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeliveryRepository extends JpaRepository<Delivery, Long> {
}
