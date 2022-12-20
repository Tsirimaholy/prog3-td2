package com.example.prog3td2.controller.mapper;

import com.example.prog3td2.controller.response.PlayerResponse;
import com.example.prog3td2.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerResponse toRest(Player domain){
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public Player toDomain(PlayerResponse rest){
        return Player.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
