package com.example.prog3td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prog3td2.model.PlayAgainst;

@Repository
public interface PlayAgainstRepository extends JpaRepository<PlayAgainst, Integer>{

}
