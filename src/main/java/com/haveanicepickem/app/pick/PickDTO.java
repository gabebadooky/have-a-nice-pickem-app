package com.haveanicepickem.app.pick;

import com.haveanicepickem.app.scoring.ScoringEntity;

public record PickDTO(
    String teamID,
    ScoringEntity confidence
) {}
