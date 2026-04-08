package com.haveanicepickem.app.boxscore;


public record BoxScoreDTO(
    short q1score,
    short q2score,
    short q3score,
    short q4score,
    short overtime,
    short total
) {}
