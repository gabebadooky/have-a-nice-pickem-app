package com.haveanicepickem.restservice.entity;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
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

    @Column(nullable = false)
    private String league;

    @Column(nullable = false)
    private short weeknum;

    @Column(name = "espn_code", nullable = false)
    private String espnCode;

    @Column(name = "cbs_code", nullable = false)
    private String cbsCode;

    @Column(name = "fox_code", nullable = false)
    private String foxCode;

    @Column(name = "vegas_code")
    private String vegasCode;

    // awayTeam
    // homeTeam
    
    @Column(name = "zule_game_time", nullable = false)
    private LocalDateTime zuluGameTime;

    @Column(name = "broadcast", nullable = false)
    private String broadcast;
    
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    private LocationEntity location;

    @Column(nullable = false)
    private boolean finished;

    @Column(
        columnDefinition = "timestamp with time zone default current_timestamp",
        nullable = false
    )
    private OffsetDateTime updatedAt;

}
