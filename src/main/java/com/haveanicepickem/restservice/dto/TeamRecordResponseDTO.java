package com.haveanicepickem.restservice.dto;

import com.haveanicepickem.constants.RecordType;

public record TeamRecordResponseDTO(
    RecordType recordType,
    short wins,
    short losses,
    short time
) {}
