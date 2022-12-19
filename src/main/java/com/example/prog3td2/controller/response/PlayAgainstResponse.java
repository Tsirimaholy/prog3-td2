package com.example.prog3td2.controller.response;

import java.time.Instant;

import com.example.prog3td2.model.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PlayAgainstResponse {
    private int id;
    private Instant dateTime;
    private Team teamA;
    private Team teamB;
}
