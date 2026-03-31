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
        TeamRecordResponseDTO conferenceRecord = new TeamRecordMapper().toDTO(team.getConferenceRecord());
        TeamRecordResponseDTO overallRecord = new TeamRecordMapper().toDTO(team.getOverallRecord());
        boolean powerConference = team.getPowerConference();
        String teamLogoURL = team.getTeamLogoURL();
        String primaryColor = team.getPrimaryColor();
        String alternateColor = team.getAlternateColor();
        short ranking = team.getRanking();

        return new TeamResponseDTO(
            league,
            conferenceID,
            divisionName,
            conferenceRecord,
            overallRecord,
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
