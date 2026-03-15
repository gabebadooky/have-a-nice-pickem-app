package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Game {

    @Id
    private String id;
    private String league;
    private Integer weeknum;
    private String espnCode;
    private String cbsCode;
    private String foxCode;
    private String vegasCode;
    // awayTeam
    // homeTeam
    private LocalDateTime zuluDateTime;
    private String broadcast;
    // location
    private boolean finished;

}
