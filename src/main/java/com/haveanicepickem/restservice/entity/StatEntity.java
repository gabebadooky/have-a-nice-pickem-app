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
@Table(name = "stats")
public class StatEntity {
    // game_id                 VARCHAR(100)    NOT NULL,
	// team_id                 VARCHAR(100)    NOT NULL,
	// stat_type               VARCHAR(25)     NOT NULL,
	// stat_value              REAL            NULL,
	// updated_at              TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
	//
	// PRIMARY KEY (game_id, team_id, stat_type),
	// CONSTRAINT fk_stats_game FOREIGN KEY (game_id) REFERENCES pickem.games(id),
	// CONSTRAINT fk_stats_team FOREIGN KEY (team_id) REFERENCES pickem.teams(id)

    @Id
    @ManyToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private GameEntity game;

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    @Id
    private String statType;

    @Column(nullable = true)
    private float statValue;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
