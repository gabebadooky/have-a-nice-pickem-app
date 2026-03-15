package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "games")
public class GameEntity {

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
    
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private LocationEntity location;

    private boolean finished;

}
