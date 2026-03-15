package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
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
    
    @OneToOne()
    @JoinColumn(name = "location_id")
    private Location location;

    private boolean finished;

}
