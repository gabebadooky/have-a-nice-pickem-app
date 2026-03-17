package com.haveanicepickem.restservice;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team_records")
public class TeamRecordEntity {
    // team_id      VARCHAR(100)    NOT NULL,
	// record_type  VARCHAR(10)     NOT NULL,
	// wins         SMALLINT        NULL,
	// losses       SMALLINT        NULL,
	// ties         SMALLINT        NULL,
	// updated_at   TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
	// 
	// PRIMARY KEY (team_id, record_type),
	// CONSTRAINT fk_team_record_team FOREIGN KEY (team_id) REFERENCES pickem.teams(id)

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    private String recordType;
    private byte wins;
    private byte losses;
    private byte ties;
    private OffsetDateTime updatedAt;

}
