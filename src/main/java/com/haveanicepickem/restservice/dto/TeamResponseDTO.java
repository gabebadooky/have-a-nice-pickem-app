package com.haveanicepickem.restservice.dto;


public record TeamResponseDTO(
    String id,
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
