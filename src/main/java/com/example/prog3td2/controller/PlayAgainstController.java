package com.example.prog3td2.controller;

import com.example.prog3td2.controller.mapper.PlayAgainstMapper;
import com.example.prog3td2.controller.response.PlayAgainstResponse;
import com.example.prog3td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService playAgainstService;
    private final PlayAgainstMapper mapper;

    @GetMapping("/matchs")
    public List<PlayAgainstResponse> getAllMatch() {
        return playAgainstService.getAllMatch().stream()
                .map(mapper::toRest)
                .collect(Collectors.toList());
    }
}
