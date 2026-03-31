package com.haveanicepickem.restservice.dto;

import java.util.List;

public record TeamResponseDTO(
    String league,
    String conferenceID,
    String divisionName,
    String teamName,
    String teamMascot,
    boolean powerConference,
    String teamLogoURL,
    String primaryColor,
    String alternateColor,
    short ranking
) {}
