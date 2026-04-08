package com.haveanicepickem.app.record;

import com.haveanicepickem.app.constants.RecordType;

public record TeamRecordDTO(
    RecordType recordType,
    short wins,
    short losses,
    short time
) {}
