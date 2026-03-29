package com.haveanicepickem.restservice.dto;


public record TeamRecordResponseDTO(
    String recordType,
    short wins,
    short losses,
    short time
) {}
