package com.haveanicepickem.restservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "scoring")
public class ScoringEntity {
    // confidence   CHAR(1)         PRIMARY KEY,
	// reward       SMALLINT        NOT NULL,
	// penalty      SMALLINT        NOT NULL,
	// updated_at   TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP

    private char confidence;
    private byte reward;
    private byte penalty;
    private LocalDateTime updatedAt;
    
}
