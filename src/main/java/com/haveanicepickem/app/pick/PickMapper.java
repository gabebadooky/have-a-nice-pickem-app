package com.haveanicepickem.app.pick;

import org.springframework.stereotype.Component;

import com.haveanicepickem.app.scoring.ScoringEntity;

@Component
public class PickMapper {

    public PickDTO toDTO(PickEntity pick) {

        String teamID = pick.getTeamPickedId();
        ScoringEntity confidence = pick.getConfidence();

        return new PickDTO(
            teamID,
            confidence
        );

    }

}
