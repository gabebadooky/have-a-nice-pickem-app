package com.haveanicepickem.restservice.dto;


public record BettingOddResponseDTO(
    String source,
    Float overUnder,
    short moneyline,
    Float spread,
    Float winProbability
) {}
