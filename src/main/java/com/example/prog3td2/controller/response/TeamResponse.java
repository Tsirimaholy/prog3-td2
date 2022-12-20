package com.example.prog3td2.controller.response;

import java.util.List;

import com.example.prog3td2.model.Player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class TeamResponse {
    private int id;
    private String name;
    private List<PlayerResponse> players;
}
