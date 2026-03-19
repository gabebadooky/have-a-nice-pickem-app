package com.haveanicepickem.restservice.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
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

    @Column(nullable = false)
    private String league;

    @Column(nullable = false)
    private String espnCode;

    @Column(nullable = false)
    private String cbsCode;

    @Column(nullable = false)
    private String foxCode;

    @Column(nullable = true)
    private String vegasCode;

    @Column(nullable = false)
    private String conferenceID;

    @Column(nullable = false)
    private String divisionName;

    @Column(nullable = false)
    private String teamName;

    @Column(nullable = false)
    private String teamMascot;

    @Column(nullable = false)
    private boolean powerConference;

    @Column(nullable = false)
    private String teamLogoUrl;

    @Column(nullable = false)
    private String teamDarkLogoUrl;

    @Column(nullable = false)
    private String primaryColor;

    @Column(nullable = false)
    private String alternateColor;

    @Column(nullable = false)
    private byte ranking;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private LocalDateTime updatedAt;

}
