package com.example.prog3td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prog3td2.model.Sponsor;

@Repository
public interface SponsorRepository extends JpaRepository<Sponsor, Integer>{
    
}
