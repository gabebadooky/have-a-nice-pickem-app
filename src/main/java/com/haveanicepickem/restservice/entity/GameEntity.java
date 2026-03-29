package com.haveanicepickem.restservice.entity;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "games", schema = "pickem")
public class GameEntity {
    // id                      VARCHAR(100)    PRIMARY KEY,
	// league                  VARCHAR(25)     NOT NULL,
	// weeknum                 SMALLINT        NOT NULL,
	// season                  SMALLINT        NOT NULL,
	// espn_code               VARCHAR(50)     NOT NULL,
	// cbs_code                VARCHAR(50)     NOT NULL,
	// fox_code                VARCHAR(50)     NOT NULL,
	// vegas_code              VARCHAR(50)     NULL,
	// away_team_id            VARCHAR(100)    NOT NULL,
	// home_team_id            VARCHAR(100)    NOT NULL,
	// zulu_game_time          TIMESTAMP       NOT NULL,
	// broadcast               VARCHAR(25)     NOT NULL,
	// location_id             VARCHAR(25)     NOT NULL,
	// finished                BOOLEAN         NOT NULL,
	// updated_at              TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    //
	// CONSTRAINT fk_games_away_team FOREIGN KEY (away_team_id) REFERENCES pickem.teams(id),
	// CONSTRAINT fk_games_home_team FOREIGN KEY (home_team_id) REFERENCES pickem.teams(id),
	// CONSTRAINT fk_games_location FOREIGN KEY (location_id) REFERENCES pickem.locations(id)

    @Id
    private String id;

    @Column(nullable = false)
    private String league;

    @Column(nullable = false)
    private short weeknum;

    @Column(nullable = false)
    private short season;

    @Column(nullable = false)
    private String espnCode;

    @Column(nullable = false)
    private String cbsCode;

    @Column(nullable = false)
    private String foxCode;

    @Column(nullable = false)
    private String vegasCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_team_id", referencedColumnName = "id", nullable = false)
    private TeamEntity awayTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id", referencedColumnName = "id", nullable = false)
    private TeamEntity homeTeam;
    
    @Column(nullable = false)
    private LocalDateTime zuluGameTime;

    @Column(nullable = false)
    private String broadcast;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    private LocationEntity location;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "forecast_id", referencedColumnName = "game_id", nullable = true)
    private GameForecastEntity forecast;

    @Column(nullable = false)
    private boolean finished;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
