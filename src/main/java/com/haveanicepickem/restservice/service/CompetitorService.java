package com.haveanicepickem.restservice.service;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.CompetitorResponseDTO;
import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.entity.BoxScoresEntity;
import com.haveanicepickem.restservice.entity.BoxScoresId;
import com.haveanicepickem.restservice.entity.StatEntity;
import com.haveanicepickem.restservice.entity.TeamEntity;
import com.haveanicepickem.restservice.repository.BettingOddsRepository;
import com.haveanicepickem.restservice.repository.BoxScoresRepository;
import com.haveanicepickem.restservice.repository.StatRepository;
import com.haveanicepickem.restservice.repository.TeamRepository;

@Service
public class CompetitorService {

    private BettingOddsRepository bettingOddsRepository;
    private BoxScoresRepository boxScoresRepository;
    private BoxScoresId boxScoresID;
    private StatRepository statRepository;
    private TeamRepository teamRepository;

    public CompetitorResponseDTO getCompetitor(String gameID, String teamID) {
        int boxscoreIdentifier = new BoxScoresId(gameID, teamID).hashCode();

        Optional<List<BettingOddsEntity>> bettingOdds = bettingOddsRepository.findByGameIdAndTeamId(gameID, teamID);
        Optional<BoxScoresEntity> boxscore = boxScoresRepository.findById(boxScoresID);
        Optional<List<StatEntity>> gameStats = statRepository.findByGameIdAndTeamId(gameID, teamID);
        Optional<List<StatEntity>> teamStats = statRepository.findByTeamId(teamID);
        Optional<TeamEntity> team = teamRepository.findById(teamID);

    }

}
