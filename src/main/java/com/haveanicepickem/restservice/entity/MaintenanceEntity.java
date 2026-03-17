package com.haveanicepickem.restservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance")
public class MaintenanceEntity {
    // id           SERIAL          PRIMARY KEY,
	// flag         BOOLEAN         NOT NULL,
	// created_at   TIMESTAMP       NOT NULL

    @Id
    private String id;

    @Column(nullable = false)
    private boolean flag;

    @Column(
        columnDefinition = "timestamp with time zone default current_timestamp",
        nullable = false
    )
    private LocalDateTime createdAt;

}
