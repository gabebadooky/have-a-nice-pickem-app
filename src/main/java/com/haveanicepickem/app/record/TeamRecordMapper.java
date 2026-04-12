package com.haveanicepickem.app.record;

import org.springframework.stereotype.Component;


@Component
public class TeamRecordMapper {
    public TeamRecordDTO toDTO(TeamRecordEntity teamRecord) {
        String recordType = teamRecord.getRecordType();
        short wins = teamRecord.getWins();
        short losses = teamRecord.getLosses();
        short ties = teamRecord.getTies();

        return new TeamRecordDTO(
            recordType,
            wins,
            losses,
            ties
        );
    }
}
