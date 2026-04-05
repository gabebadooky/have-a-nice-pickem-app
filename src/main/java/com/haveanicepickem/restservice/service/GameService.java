package com.haveanicepickem.restservice.service;

import com.haveanicepickem.restservice.dto.GameMapper;
import com.haveanicepickem.restservice.dto.GameResponseDTO;
import com.haveanicepickem.restservice.repository.GameRepository;

public class GameService {

    private GameRepository gameRepository;
    private GameMapper gameMapper;
    private String gameID;

    public GameService(String gameID) {
        this.gameID = gameID;
    }

    public GameResponseDTO getGame() {
        return gameRepository.findById(gameID)
                                .map(gameMapper::toDTO)
                                .orElse(null);
    }

}
