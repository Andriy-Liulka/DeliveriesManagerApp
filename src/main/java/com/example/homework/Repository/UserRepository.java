package com.example.homework.Repository;

import com.example.homework.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    @Query("SELECT usr FROM User usr WHERE usr.email=?1")
    User findByEmailUser(String email);
}
