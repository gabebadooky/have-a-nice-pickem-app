package com.haveanicepickem.restservice.dto;

import org.springframework.stereotype.Component;

import com.haveanicepickem.restservice.entity.TeamEntity;

@Component
public class TeamMapper {
    public TeamResponseDTO toDTO(TeamEntity team) {
        String league = team.getLeague();
        String conferenceID = team.getConferenceID();
        String divisionName = team.getDivisionName();
        String teamName = team.getTeamName();
        String teamMascot = team.getTeamMascot();
        boolean powerConference = team.getPowerConference();
        String teamLogoURL = team.getTeamLogoURL();
        String primaryColor = team.getPrimaryColor();
        String alternateColor = team.getAlternateColor();
        short ranking = team.getRanking();

        return new TeamResponseDTO(
            league,
            conferenceID,
            divisionName,
            teamName,
            teamMascot, 
            powerConference,
            teamLogoURL,
            primaryColor,
            alternateColor,
            ranking
        );
    }
}
