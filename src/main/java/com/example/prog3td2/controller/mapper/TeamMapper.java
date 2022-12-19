package com.example.prog3td2.controller.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.prog3td2.controller.response.TeamResponse;
import com.example.prog3td2.model.Sponsor;
import com.example.prog3td2.model.Team;
import com.example.prog3td2.repository.Teamrepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TeamMapper {
    private Teamrepository teamrepository;

    public Team toDomain(TeamResponse rest) {
        Optional<Team> findById = teamrepository.findById(rest.getId());
        Team team = null;
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
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
