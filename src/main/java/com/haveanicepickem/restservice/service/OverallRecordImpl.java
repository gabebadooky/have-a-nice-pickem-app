package com.haveanicepickem.restservice.service;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.restservice.dto.TeamRecordMapper;
import com.haveanicepickem.restservice.dto.TeamRecordResponseDTO;
import com.haveanicepickem.restservice.entity.TeamRecordId;
import com.haveanicepickem.restservice.repository.TeamRecordRepository;

public class OverallRecordImpl {

    private TeamRecordRepository teamRecordRepository;
    private TeamRecordMapper teamRecordMapper;
    private String teamID;
    private RecordType recordType;

    public OverallRecordImpl(String teamID, RecordType recordType) {
        this.teamID = teamID;
        this.recordType = recordType;
    }

    public TeamRecordResponseDTO getRecord() {
        TeamRecordId overallRecordIdentifier = new TeamRecordId(teamID, recordType);
        return teamRecordRepository.findById(overallRecordIdentifier)
                                    .map(teamRecordMapper::toDTO)
                                    .orElse(null);
    }

}
