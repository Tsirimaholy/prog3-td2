package com.example.prog3td2.service.utils;

import com.example.prog3td2.model.Player;

import java.util.Comparator;
import java.util.List;

public class PlayAgainstUtils {
    public static List<Player> orderByNumber(List <Player> players){
        return players.stream()
                .sorted(Comparator.comparingInt(Player::getNumber))
                .toList();
    }
}
