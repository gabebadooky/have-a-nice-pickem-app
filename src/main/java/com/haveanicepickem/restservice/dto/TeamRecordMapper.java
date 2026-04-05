package com.haveanicepickem.restservice.dto;

import org.springframework.stereotype.Component;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.restservice.entity.TeamRecordEntity;

@Component
public class TeamRecordMapper {
    public TeamRecordResponseDTO toDTO(TeamRecordEntity teamRecord) {
        RecordType recordType = teamRecord.getRecordType();
        short wins = teamRecord.getWins();
        short losses = teamRecord.getLosses();
        short ties = teamRecord.getTies();

        return new TeamRecordResponseDTO(
            recordType,
            wins,
            losses,
            ties
        );
    }
}
