package com.haveanicepickem.app.record.impl;

import com.haveanicepickem.app.constants.RecordType;
import com.haveanicepickem.app.record.TeamRecordDTO;
import com.haveanicepickem.app.record.TeamRecordId;
import com.haveanicepickem.app.record.TeamRecordMapper;
import com.haveanicepickem.app.record.TeamRecordRepository;
import com.haveanicepickem.app.record.TeamRecordService;

public class OverallRecordImpl implements TeamRecordService {

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
