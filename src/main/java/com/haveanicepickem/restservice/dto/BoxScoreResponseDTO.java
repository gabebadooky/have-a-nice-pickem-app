package com.haveanicepickem.restservice.dto;


public record BoxScoreResponseDTO(
    short q1score,
    short q2score,
    short q3score,
    short q4score,
    short overtime,
    short total
) {}
