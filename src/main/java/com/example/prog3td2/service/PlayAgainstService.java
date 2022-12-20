package com.example.prog3td2.service;

import com.example.prog3td2.model.PlayAgainst;
import com.example.prog3td2.model.Team;
import com.example.prog3td2.repository.PlayAgainstRepository;
import com.example.prog3td2.service.utils.PlayAgainstUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository playAgainstrepository;

    public List<PlayAgainst> getAllMatch() {
        List<PlayAgainst> matchList = playAgainstrepository.findAll();
        // sort each player on match by their number
        matchList.forEach(match -> {
                    Team team1 = match.getTeam1();
                    Team team2 = match.getTeam2();

                    team1.setPlayers(PlayAgainstUtils.orderByNumber(team1.getPlayers()));
                    team2.setPlayers(PlayAgainstUtils.orderByNumber(team2.getPlayers()));
                }
        );

        return matchList;
    }
}
