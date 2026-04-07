package com.haveanicepickem.boxscore;

import org.springframework.stereotype.Service;

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

    public BoxScoreDTO getBoxscores() {
        BoxScoresId boxscoreIdentifier = new BoxScoresId(gameID, teamID);
        return boxScoresRepository.findById(boxscoreIdentifier)
                                    .map(boxScoreMapper::toDTO)
                                    .orElse(null);
    }

}
