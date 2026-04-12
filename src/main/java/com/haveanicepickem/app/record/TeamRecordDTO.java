package com.haveanicepickem.app.record;

public record TeamRecordDTO(
    String recordType,
    short wins,
    short losses,
    short time
) {}
