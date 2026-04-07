package com.haveanicepickem.record;

import com.haveanicepickem.constants.RecordType;

public record TeamRecordDTO(
    RecordType recordType,
    short wins,
    short losses,
    short time
) {}
