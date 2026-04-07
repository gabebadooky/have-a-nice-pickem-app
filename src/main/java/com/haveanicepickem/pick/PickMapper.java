package com.haveanicepickem.pick;

import org.springframework.stereotype.Component;

import com.haveanicepickem.scoring.ScoringEntity;

@Component
public class PickMapper {

    public PickDTO toDTO(PickEntity pick) {

        String teamID = pick.getTeam();
        ScoringEntity confidence = pick.getConfidence();

        return new PickDTO(
            teamID,
            confidence
        );

    }

}
