package com.example.prog3td2.controller;

import com.example.prog3td2.controller.mapper.PlayerMapper;
import com.example.prog3td2.controller.response.PlayerResponse;
import com.example.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class PlayerController {
    private final PlayerMapper playerMapper;
    private final PlayerService playerService;

    @GetMapping("/players")
    public List<PlayerResponse> getAll(){
        return playerService.getAll().stream()
                .map(playerMapper::toRest).toList();
    }
}
