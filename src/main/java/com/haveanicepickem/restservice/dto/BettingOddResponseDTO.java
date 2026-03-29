package com.haveanicepickem.restservice.dto;


public record BettingOddResponseDTO(
    String source,
    Float overUnder,
    byte moneyline,
    Float spread,
    Float winProbability
) {}
