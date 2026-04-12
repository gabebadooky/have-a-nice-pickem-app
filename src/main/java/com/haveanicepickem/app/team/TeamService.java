package com.haveanicepickem.app.team;

import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public TeamService(TeamRepository teamRepository, TeamMapper teamMapper) {
        this.teamRepository = teamRepository;
        this.teamMapper = teamMapper;
    }

    public TeamDTO getTeam(String teamID) {
        return teamRepository.findById(teamID)
                                .map(teamMapper::toDTO)
                                .orElse(null);
    }

}
