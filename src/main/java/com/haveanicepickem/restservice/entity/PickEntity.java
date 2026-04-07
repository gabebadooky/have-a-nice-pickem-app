package com.haveanicepickem.restservice.entity;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;

import com.haveanicepickem.game.GameEntity;
import com.haveanicepickem.team.TeamEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "picks", schema = "pickem")
public class PickEntity {
    // user_id                 INTEGER         NOT NULL,
	// game_id                 VARCHAR(100)    NOT NULL,
	// team_picked             VARCHAR(100)    NULL,
	// confidence              CHAR(1)         NULL,
	// updated_at              TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    //
	// PRIMARY KEY (user_id, game_id),
	// CONSTRAINT fk_picks_user FOREIGN KEY (user_id) REFERENCES pickem.users(id),
	// CONSTRAINT fk_picks_game FOREIGN KEY (game_id) REFERENCES pickem.games(id),
	// CONSTRAINT fk_picks_team FOREIGN KEY (team_picked) REFERENCES pickem.teams(id),
	// CONSTRAINT fk_pick_confidence FOREIGN KEY (confidence) REFERENCES pickem.scoring(confidence)

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private GameEntity game;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_picked", referencedColumnName = "id")
    private TeamEntity team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "confidence", referencedColumnName = "confidence")
    private ScoringEntity confidence;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
