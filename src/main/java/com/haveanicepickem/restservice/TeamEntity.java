package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class TeamEntity {

    @Id
    private String id;
    private String league;
    private String espnCode;
    private String cbsCode;
    private String foxCode;
    private String vegasCode;
    private String conferenceID;
    private String divisionName;
    private String teamName;
    private String teamMascot;
    private boolean powerConference;
    private String teamLogoUrl;
    private String teamDarkLogoUrl;
    private String primaryColor;
    private String alternateColor;
    private byte ranking;
    private LocalDateTime updatedAt;

}
