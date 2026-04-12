package com.haveanicepickem.app.record.impl;

import org.springframework.stereotype.Service;

import com.haveanicepickem.app.record.TeamRecordDTO;
import com.haveanicepickem.app.record.TeamRecordId;
import com.haveanicepickem.app.record.TeamRecordMapper;
import com.haveanicepickem.app.record.TeamRecordRepository;
import com.haveanicepickem.app.record.TeamRecordService;
import com.haveanicepickem.app.shared.constants.RecordType;

@Service
public class ConferenceRecordImpl implements TeamRecordService {

    private TeamRecordRepository teamRecordRepository;
    private TeamRecordMapper teamRecordMapper;

    public ConferenceRecordImpl(TeamRecordRepository teamRecordRepository, TeamRecordMapper teamRecordMapper) {
        this.teamRecordRepository = teamRecordRepository;
        this.teamRecordMapper = teamRecordMapper;
    }

    public TeamRecordDTO getRecord(String teamID, RecordType recordType) {
        String recordTypeString = recordType.text();
        TeamRecordId conferenceRecordIdentifier = new TeamRecordId(teamID, recordTypeString);
        return teamRecordRepository.findById(conferenceRecordIdentifier)
                                    .map(teamRecordMapper::toDTO)
                                    .orElse(null);
    }

}
