package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.BoxScoreMapper;
import com.haveanicepickem.restservice.dto.BoxScoreResponseDTO;
import com.haveanicepickem.restservice.entity.BoxScoresId;
import com.haveanicepickem.restservice.repository.BoxScoresRepository;

@Service
public class BoxScoreService {

    private BoxScoresRepository boxScoresRepository;
    private BoxScoreMapper boxScoreMapper;
    private String gameID;
    private String teamID;

    public BoxScoreService(String gameID, String teamID) {
        this.gameID = gameID;
        this.teamID = teamID;
    }

    public BoxScoreResponseDTO getBoxscores() {
        BoxScoresId boxscoreIdentifier = new BoxScoresId(gameID, teamID);
        return boxScoresRepository.findById(boxscoreIdentifier)
                                    .map(boxScoreMapper::toDTO)
                                    .orElse(null);
    }

}
