package com.haveanicepickem.app.record;

import org.springframework.stereotype.Component;

import com.haveanicepickem.app.constants.RecordType;

@Component
public class TeamRecordMapper {
    public TeamRecordDTO toDTO(TeamRecordEntity teamRecord) {
        RecordType recordType = teamRecord.getRecordType();
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
