package com.haveanicepickem.app.game;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepository gameRepository;
    private final GameMapper gameMapper;

    public GameService(GameRepository gameRepository, GameMapper gameMapper) {
        this.gameRepository = gameRepository;
        this.gameMapper = gameMapper;
    }

    public GameDTO getGame(String gameID) {
        if (gameID == null) {
            gameID = "";
        }
        
        return gameRepository.findById(gameID)
                                .map(gameMapper::toDTO)
                                .orElse(null);
    }

}
