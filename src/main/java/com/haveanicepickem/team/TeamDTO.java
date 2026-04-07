package com.haveanicepickem.team;


public record TeamDTO(
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
