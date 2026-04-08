package com.haveanicepickem.app.team;

import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private TeamRepository teamRepository;
    private TeamMapper teamMapper;
    private String teamID;

    public TeamService(String teamID) {
        this.teamID = teamID;
    }

    public TeamDTO getTeam() {
        return teamRepository.findById(teamID)
                                .map(teamMapper::toDTO)
                                .orElse(null);
    }

}
