package com.example.prog3td2.controller.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlayerResponse {
    private int id;
    private String name;
}
