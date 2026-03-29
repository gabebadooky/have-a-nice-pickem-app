package com.haveanicepickem.restservice.entity;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(TeamRecordId.class)
@Table(name = "team_records", schema = "pickem")
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    @Id
    @Column(nullable = false)
    private String recordType;

    @Column(nullable = true)
    private byte wins;

    @Column(nullable = true)
    private byte losses;

    @Column(nullable = true)
    private byte ties;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
