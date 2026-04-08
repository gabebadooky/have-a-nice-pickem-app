package com.haveanicepickem.app.matchup;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haveanicepickem.app.constants.HaveANicePickemConstants;

@RestController
public class MatchupController {
    
    @GetMapping(HaveANicePickemConstants.MATCHUPS)
    public List<MatchupDTO> getMatchups() {
        return new MatchupService().getAllMatchups();
    }

}
