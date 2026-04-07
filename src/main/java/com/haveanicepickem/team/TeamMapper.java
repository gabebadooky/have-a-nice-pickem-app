package com.haveanicepickem.team;

import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
    public TeamDTO toDTO(TeamEntity team) {
        String id = team.getTeamID();
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

        return new TeamDTO(
            id,
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
