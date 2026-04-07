package com.haveanicepickem.record.impl;

import org.springframework.stereotype.Service;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.record.TeamRecordDTO;
import com.haveanicepickem.record.TeamRecordId;
import com.haveanicepickem.record.TeamRecordMapper;
import com.haveanicepickem.record.TeamRecordRepository;

@Service
public class ConferenceRecordImpl {

    private TeamRecordRepository teamRecordRepository;
    private TeamRecordMapper teamRecordMapper;
    private String teamID;
    private RecordType recordType;

    public ConferenceRecordImpl(String teamID, RecordType recordType) {
        this.teamID = teamID;
        this.recordType = recordType;
    }

    public TeamRecordDTO getRecord() {
        TeamRecordId conferenceRecordIdentifier = new TeamRecordId(teamID, recordType);
        return teamRecordRepository.findById(conferenceRecordIdentifier)
                                    .map(teamRecordMapper::toDTO)
                                    .orElse(null);
    }

}
