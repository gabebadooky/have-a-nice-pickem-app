package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.TeamMapper;
import com.haveanicepickem.restservice.dto.TeamResponseDTO;
import com.haveanicepickem.restservice.repository.TeamRepository;

@Service
public class TeamService {

    private TeamRepository teamRepository;
    private TeamMapper teamMapper;
    private String teamID;

    public TeamService(String teamID) {
        this.teamID = teamID;
    }

    public TeamResponseDTO getTeam() {
        return teamRepository.findById(teamID)
                                .map(teamMapper::toDTO)
                                .orElse(null);
    }

}
