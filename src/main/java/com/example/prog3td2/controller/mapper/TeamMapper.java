package com.example.prog3td2.controller.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.example.prog3td2.controller.response.PlayerResponse;
import org.springframework.stereotype.Component;

import com.example.prog3td2.controller.response.TeamResponse;
import com.example.prog3td2.model.Sponsor;
import com.example.prog3td2.model.Team;
import com.example.prog3td2.repository.TeamRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TeamMapper {
    private TeamRepository teamrepository;
    private PlayerMapper playerMapper;

    public Team toDomain(TeamResponse rest) {
        Optional<Team> findById = teamrepository.findById(rest.getId());
        Team team;
        List<Sponsor> sponsors = new ArrayList<>();
        
         if (findById.isPresent()) {
            team = findById.get();
            sponsors = team.getSponsors();
        }


        return Team.builder()
                    .id(rest.getId())
                    .name(rest.getName())
                    .sponsors(sponsors)
                    .build();
    }

    public TeamResponse toRest(Team domain) {
        List<PlayerResponse> restPlayers = domain.getPlayers().stream().map(playerMapper::toRest).toList();
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(restPlayers)
                .build();
    }
}
