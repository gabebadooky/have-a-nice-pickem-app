package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.constants.RecordType;
import com.haveanicepickem.restservice.dto.TeamRecordMapper;
import com.haveanicepickem.restservice.dto.TeamRecordResponseDTO;
import com.haveanicepickem.restservice.entity.TeamRecordId;
import com.haveanicepickem.restservice.repository.TeamRecordRepository;

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

    public TeamRecordResponseDTO getRecord() {
        TeamRecordId conferenceRecordIdentifier = new TeamRecordId(teamID, recordType);
        return teamRecordRepository.findById(conferenceRecordIdentifier)
                                    .map(teamRecordMapper::toDTO)
                                    .orElse(null);
    }

}
