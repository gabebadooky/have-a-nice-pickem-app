package com.haveanicepickem.game;

import org.springframework.stereotype.Service;

@Service
public class GameService {

    private GameRepository gameRepository;
    private GameMapper gameMapper;
    private String gameID;

    public GameService(String gameID) {
        this.gameID = gameID;
    }

    public GameDTO getGame() {
        return gameRepository.findById(gameID)
                                .map(gameMapper::toDTO)
                                .orElse(null);
    }

}
