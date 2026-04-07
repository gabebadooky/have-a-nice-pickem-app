package com.haveanicepickem.pick;

import com.haveanicepickem.scoring.ScoringEntity;

public record PickDTO(
    String teamID,
    ScoringEntity confidence
) {}
