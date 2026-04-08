package com.haveanicepickem.app.boxscore;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;

import com.haveanicepickem.app.game.GameEntity;
import com.haveanicepickem.app.team.TeamEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(BoxScoresId.class)
@Table(name = "box_scores", schema = "pickem")
public class BoxScoresEntity {
    // game_id                 VARCHAR(100)    NOT NULL,
	// team_id                 VARCHAR(100)    NOT NULL,
	// q1_score                SMALLINT        NULL,
	// q2_score                SMALLINT        NULL,
	// q3_score                SMALLINT        NULL,
	// q4_score                SMALLINT        NULL,
	// overtime                SMALLINT        NULL,
	// total                   SMALLINT        NULL,
	// updated_at              TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    //
	// PRIMARY KEY (game_id, team_id),
	// CONSTRAINT fk_box_scores_game FOREIGN KEY (game_id) REFERENCES pickem.games(id),
	// CONSTRAINT fk_box_scores_team FOREIGN KEY (team_id) REFERENCES pickem.teams(id)

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private GameEntity game;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    @Column(nullable = true)
    private byte q1score;

    @Column(nullable = true)
    private byte q2score;

    @Column(nullable = true)
    private byte q3score;

    @Column(nullable = true)
    private byte q4score;

    @Column(nullable = true)
    private byte overtime;

    @Column(nullable = true)
    private byte total;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;


    public short getQ1score() {
        return this.q1score;
    }

    public short getQ2score() {
        return this.q2score;
    }

    public short getQ3score() {
        return this.q3score;
    }

    public short getQ4score() {
        return this.q4score;
    }

    public short getOvertime() {
        return this.overtime;
    }

    public short getTotal() {
        return this.total;
    }

}
