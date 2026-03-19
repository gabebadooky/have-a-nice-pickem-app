package com.haveanicepickem.restservice.entity;

import java.time.OffsetDateTime;
import org.hibernate.annotations.ColumnDefault;
import jakarta.persistence.Column;
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

    @Column(nullable = false)
    private String stadium;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private float latitude;

    @Column(nullable = false)
    private float longitude;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
