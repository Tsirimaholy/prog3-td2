package com.example.prog3td2.service;

import com.example.prog3td2.model.Player;
import com.example.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public List<Player> getAll(){
        return playerRepository.findAll();
    }
}
