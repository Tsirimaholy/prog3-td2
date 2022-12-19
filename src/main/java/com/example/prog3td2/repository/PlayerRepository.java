package com.example.prog3td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PlayerRepository
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
    
}