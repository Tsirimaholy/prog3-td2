package com.example.prog3td2.controller.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import com.example.prog3td2.controller.response.PlayAgainstResponse;
import com.example.prog3td2.model.PlayAgainst;

/**
 * PlayAgainstMapper
 */
@Component
@AllArgsConstructor
public class PlayAgainstMapper {
    public final TeamMapper teamMapper;

    public PlayAgainst toDomain(PlayAgainstResponse rest) {
        return PlayAgainst.builder()
                .dateTime(rest.getDateTime())
                .id(rest.getId())
                .team1(teamMapper.toDomain(rest.getTeamA()))
                .team2(teamMapper.toDomain(rest.getTeamB()))
                .build();
    }

    public PlayAgainstResponse toRest(PlayAgainst domain){
        return PlayAgainstResponse.builder()
                    .id(domain.getId())
                    .dateTime(domain.getDateTime())
                    .teamA(teamMapper.toRest(domain.getTeam1()))
                    .teamB(teamMapper.toRest(domain.getTeam2()))
                    .build();
    }
}