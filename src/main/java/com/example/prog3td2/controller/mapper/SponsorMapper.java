package com.example.prog3td2.controller.mapper;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.prog3td2.controller.response.SponsorResponse;
import com.example.prog3td2.model.Sponsor;
import com.example.prog3td2.model.Team;
import com.example.prog3td2.repository.SponsorRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SponsorMapper {
    private SponsorRepository sponsorRepository;

    public Sponsor toDomain(SponsorResponse rest) {
        Optional<Sponsor> sponsorOptional = sponsorRepository.findById(rest.getId());
        Sponsor sponsor = null;
        if(sponsorOptional.isPresent()){
            sponsor = sponsorOptional.get();
        }
    
        List<Team> team = sponsor != null ? sponsor.getTeams(): null;

        
        return Sponsor.builder()
                .id(rest.getId())
                .name(rest.getName())
                .teams(team)
                .build();
    }

    public SponsorResponse toRest(Sponsor domain) {
        return SponsorResponse.builder()
        .id(domain.getId())
        .name(domain.getName())
        .build();
    }
}
