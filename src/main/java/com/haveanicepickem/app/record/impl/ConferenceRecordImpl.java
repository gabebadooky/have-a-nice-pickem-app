package com.haveanicepickem.app.record.impl;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.constants.RecordType;
import com.haveanicepickem.app.record.TeamRecordDTO;
import com.haveanicepickem.app.record.TeamRecordId;
import com.haveanicepickem.app.record.TeamRecordMapper;
import com.haveanicepickem.app.record.TeamRecordRepository;
import com.haveanicepickem.app.record.TeamRecordService;

@Service
public class ConferenceRecordImpl implements TeamRecordService {

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
