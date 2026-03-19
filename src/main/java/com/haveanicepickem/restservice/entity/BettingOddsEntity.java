package com.haveanicepickem.restservice.entity;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "betting_odds")
public class BettingOddsEntity {
    // game_id                 VARCHAR(100)    NOT NULL,
	// team_id                 VARCHAR(100)    NOT NULL,
	// source                  VARCHAR(10)     NOT NULL,
	// over_under              REAL            NULL,
	// moneyline               SMALLINT        NULL,
	// spread                  REAL            NULL,
	// win_probability         REAL            NULL,
	// updated_at              TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    //
	// PRIMARY KEY (game_id, team_id, source),
	// CONSTRAINT fk_betting_odds_game FOREIGN KEY (game_id) REFERENCES pickem.games(id),
	// CONSTRAINT fk_betting_odds_team FOREIGN KEY (team_id) REFERENCES pickem.teams(id)

    @Id
    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private GameEntity game;

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    @Id
    @Column(nullable = false)
    private String source;
    
    @Column(nullable = true)
    private float overUnder;
    
    @Column(nullable = true)
    private byte moneyline;
    
    @Column(nullable = true)
    private float spread;
    
    @Column(nullable = true)
    private float winProbability;
    
    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
