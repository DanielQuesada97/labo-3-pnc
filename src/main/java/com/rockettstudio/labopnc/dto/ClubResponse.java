package com.rockettstudio.labopnc.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ClubResponse {
    private UUID id;
    private String name;
    private String country;
    private String coach;
    private Integer titles;
}