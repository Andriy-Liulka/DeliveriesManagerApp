package com.example.homework.Repository;
import com.example.homework.Entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOfferRepository extends JpaRepository<Offer, Long> {
}
