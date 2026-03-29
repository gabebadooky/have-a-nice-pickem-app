package com.haveanicepickem.restservice.dto;


public record LocationResponseDTO(
    String stadium,
    String city,
    String state,
    Float latitude,
    Float longitude
) {}
