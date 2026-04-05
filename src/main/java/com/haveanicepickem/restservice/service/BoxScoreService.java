package com.haveanicepickem.restservice.service;

import java.util.Optional;

import com.haveanicepickem.restservice.dto.BoxScoreMapper;
import com.haveanicepickem.restservice.dto.BoxScoreResponseDTO;
import com.haveanicepickem.restservice.entity.BoxScoresEntity;
import com.haveanicepickem.restservice.entity.BoxScoresId;
import com.haveanicepickem.restservice.repository.BoxScoresRepository;

public class BoxScoreService {

    private BoxScoresRepository boxScoresRepository;
    private BoxScoreMapper boxScoreMapper;

    public BoxScoreResponseDTO getBoxscores(String gameID, String teamID) {
        BoxScoresId boxscoreIdentifier = new BoxScoresId(gameID, teamID);
        
        Optional<BoxScoresEntity> optionalBoxscore = boxScoresRepository.findById(boxscoreIdentifier);

        BoxScoreResponseDTO mappedBoxscore = boxScoreMapper.toDTO(optionalBoxscore.orElse(null));
        
        return mappedBoxscore;
    }

}
