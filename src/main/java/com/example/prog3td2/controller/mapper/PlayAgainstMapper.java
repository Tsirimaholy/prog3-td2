package com.example.prog3td2.controller.mapper;

import org.springframework.stereotype.Component;

import com.example.prog3td2.controller.response.PlayAgainstResponse;
import com.example.prog3td2.model.PlayAgainst;

/**
 * PlayAgainstMapper
 */
@Component
public class PlayAgainstMapper {

    public PlayAgainst toDomain(PlayAgainstResponse rest) {
        return PlayAgainst.builder()
                .dateTime(rest.getDateTime())
                .id(rest.getId())
                .team1(rest.getTeamA())
                .team2(rest.getTeamB())
                .build();
    }

    public PlayAgainstResponse torest(PlayAgainst domain){
        return PlayAgainstResponse.builder()
                    .id(domain.getId())
                    .dateTime(domain.getDateTime())
                    .teamA(domain.getTeam1())
                    .teamB(domain.getTeam2())
                    .build();
    }
}