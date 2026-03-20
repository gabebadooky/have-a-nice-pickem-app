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
@IdClass(PredictionId.class)
@Table(name = "predictions")
public class PredictionEntity {
    // user_id                 INTEGER         NOT NULL,
	// prediction_code         VARCHAR(25)     NOT NULL,
	// prediction_description  VARCHAR(100)   	NULL,
	// prediction_selection    VARCHAR(100)    NULL,
    //
	// PRIMARY KEY (user_id, prediction_code),
	// CONSTRAINT fk_predictions_user FOREIGN KEY (user_id) REFERENCES pickem.users(id)

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @Id
    private String predictionCode;

    @Column(nullable = true)
    private String predictionDescription;

    @Column(nullable = true)
    private String predictionSelection;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
