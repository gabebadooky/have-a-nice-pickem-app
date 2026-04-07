package com.haveanicepickem.record.impl;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.record.TeamRecordDTO;
import com.haveanicepickem.record.TeamRecordId;
import com.haveanicepickem.record.TeamRecordMapper;
import com.haveanicepickem.record.TeamRecordRepository;

public class OverallRecordImpl {

    private TeamRecordRepository teamRecordRepository;
    private TeamRecordMapper teamRecordMapper;
    private String teamID;
    private RecordType recordType;

    public OverallRecordImpl(String teamID, RecordType recordType) {
        this.teamID = teamID;
        this.recordType = recordType;
    }

    public TeamRecordDTO getRecord() {
        TeamRecordId overallRecordIdentifier = new TeamRecordId(teamID, recordType);
        return teamRecordRepository.findById(overallRecordIdentifier)
                                    .map(teamRecordMapper::toDTO)
                                    .orElse(null);
    }

}
