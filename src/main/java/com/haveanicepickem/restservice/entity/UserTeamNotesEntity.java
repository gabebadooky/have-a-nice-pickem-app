package com.haveanicepickem.restservice.entity;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(UserTeamNotesId.class)
@Table(name = "user_team_notes")
public class UserTeamNotesEntity {
    // user_id      INTEGER         NOT NULL,
	// team_id      VARCHAR(100)    NOT NULL,
	// notes        BYTEA           NULL,
	// updated_at   TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
	// 
	// PRIMARY KEY (user_id, team_id),
	// CONSTRAINT fk_user_team_notes_user FOREIGN KEY (user_id) REFERENCES pickem.users(id),
	// CONSTRAINT fk_user_team_notes_team FOREIGN KEY (team_id) REFERENCES pickem.teams(id)
    
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    @Column(columnDefinition = "bytea", nullable = true)
    private byte[] notes;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;
    
}
