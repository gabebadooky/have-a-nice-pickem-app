package com.haveanicepickem.restservice;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "locations")
public class LocationEntity {
    // id           VARCHAR(25)     PRIMARY KEY,
	// stadium      VARCHAR(100)    NOT NULL,
	// city         VARCHAR(50)     NOT NULL,
	// state        VARCHAR(25)     NOT NULL,
	// latitude     REAL           	NOT NULL,
	// longitude    REAL           	NOT NULL,
	// updated_at   TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP

    @Id
    private String id;
    private String stadium;
    private String city;
    private String state;
    private float latitude;
    private float longitude;
    private OffsetDateTime updatedAt;

}
