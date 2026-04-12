package com.haveanicepickem.app.matchup;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haveanicepickem.app.shared.constants.HaveANicePickemConstants;


@RestController
public class MatchupController {

    private final MatchupService matchupService;

    public MatchupController(MatchupService matchupService) {
        this.matchupService = matchupService;
    }
    
    @GetMapping(HaveANicePickemConstants.MATCHUPS)
    public List<MatchupDTO> getMatchups() {
        return matchupService.getAllMatchups();
    }

}
