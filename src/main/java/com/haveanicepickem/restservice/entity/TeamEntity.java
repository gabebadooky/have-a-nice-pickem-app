package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class TeamEntity {
    // id                   VARCHAR(100)    PRIMARY KEY,
	// league               VARCHAR(25)     NOT NULL,
	// espn_code            VARCHAR(50)     NOT NULL,
	// cbs_code             VARCHAR(50)     NOT NULL,
	// fox_code             VARCHAR(50)     NOT NULL,
	// vegas_code           VARCHAR(50)     NULL,
	// conference_id        VARCHAR(25)     NOT NULL,
	// division_name        VARCHAR(50)     NOT NULL,
	// team_name            VARCHAR(50)     NOT NULL,
	// team_mascot          VARCHAR(50)     NOT NULL,
	// power_conference     BOOLEAN         NOT NULL,
	// team_logo_url        VARCHAR(100)    NOT NULL,
	// team_dark_logo_url   VARCHAR(100)    NOT NULL,
	// primary_color        VARCHAR(10)     NOT NULL,
	// alternate_color      VARCHAR(10)     NOT NULL,
	// ranking              SMALLINT        NOT NULL,
	// updated_at           TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP

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
