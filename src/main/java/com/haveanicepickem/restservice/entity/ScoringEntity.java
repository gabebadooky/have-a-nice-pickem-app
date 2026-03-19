package com.haveanicepickem.restservice.entity;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scoring")
public class ScoringEntity {
    // confidence   CHAR(1)         PRIMARY KEY,
	// reward       SMALLINT        NOT NULL,
	// penalty      SMALLINT        NOT NULL,
	// updated_at   TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP

    @Id
    private char confidence;

    @Column(nullable = false)
    private byte reward;

    @Column(nullable = false)
    private byte penalty;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;
    
}
