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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(GameForecastId.class)
@Table(name = "game_forecasts")
public class GameForecastEntity {
    // game_id                 VARCHAR(100)    NOT NULL,
	// location_id             VARCHAR(25)		NOT NULL,
	// temperature             REAL            NULL,
	// feels_like              REAL            NULL,
	// humidity                REAL            NULL,
	// visibility              REAL            NULL,
	// wind_speed              REAL            NULL,
	// short_description       varchar(100)    NULL,
	// long_description        varchar(100)    NULL,
	// updated_at              TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP,
    //
	// PRIMARY KEY (game_id, location_id),
	// CONSTRAINT fk_forecasts_location FOREIGN KEY (location_id) REFERENCES pickem.locations(id)

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private GameEntity game;

    @Column(nullable = true)
    private float temperature;

    @Column(nullable = true)
    private float feelsLike;

    @Column(nullable = true)
    private float humidity;

    @Column(nullable = true)
    private float visibility;

    @Column(nullable = true)
    private float windSpeed;

    @Column(nullable = true)
    private float shortDescription;

    @Column(nullable = true)
    private float longDescription;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
