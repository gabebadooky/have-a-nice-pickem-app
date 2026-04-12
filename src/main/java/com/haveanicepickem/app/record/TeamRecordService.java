package com.haveanicepickem.app.record;

import com.haveanicepickem.app.shared.constants.RecordType;

public interface TeamRecordService {
    TeamRecordDTO getRecord(String teamID, RecordType recordType);
}
