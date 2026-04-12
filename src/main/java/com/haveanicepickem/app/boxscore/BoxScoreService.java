package com.haveanicepickem.app.boxscore;

import org.springframework.stereotype.Service;

@Service
public class BoxScoreService {

    private final BoxScoresRepository boxScoresRepository;
    private final BoxScoreMapper boxScoreMapper;

    public BoxScoreService(BoxScoresRepository boxScoresRepository, BoxScoreMapper boxScoreMapper) {
        this.boxScoresRepository = boxScoresRepository;
        this.boxScoreMapper = boxScoreMapper;
    }

    public BoxScoreDTO getBoxscores(String gameID, String teamID) {
        BoxScoresId boxscoreIdentifier = new BoxScoresId(gameID, teamID);
        return boxScoresRepository.findById(boxscoreIdentifier)
                                    .map(boxScoreMapper::toDTO)
                                    .orElse(null);
    }

}
