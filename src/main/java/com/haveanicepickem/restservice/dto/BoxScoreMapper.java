package com.haveanicepickem.restservice.dto;

import com.haveanicepickem.restservice.entity.BoxScoresEntity;

public class BoxScoreMapper {
    public BoxScoreResponseDTO toDTO(BoxScoresEntity boxscores) {
        short q1score = boxscores.getQ1score();
        short q2score = boxscores.getQ2score();
        short q3score = boxscores.getQ3score();
        short q4score = boxscores.getQ4score();
        short overtime = boxscores.getOvertime();
        short total = boxscores.getTotal();

        return new BoxScoreResponseDTO(
            q1score,
            q2score,
            q3score,
            q4score,
            overtime,
            total
        );
    }
}
