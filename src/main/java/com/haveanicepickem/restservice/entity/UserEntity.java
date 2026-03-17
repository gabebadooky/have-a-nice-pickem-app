package com.haveanicepickem.restservice;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class UserEntity {
    // id               SERIAL          PRIMARY KEY,
	// username         VARCHAR(75)     NOT NULL,
	// display_name     VARCHAR(50)     NOT NULL,
	// favorite_team    VARCHAR(100)    NOT NULL,
	// notif_pref       CHAR(1)         NOT NULL,
	// email_address    VARCHAR(75)     NOT NULL,
	// phone            VARCHAR(10)     NOT NULL,
	// created_at       TIMESTAMP       NOT NULL DEFAULT CURRENT_TIMESTAMP,
	// updated_at       TIMESTAMPTZ     NOT NULL DEFAULT CURRENT_TIMESTAMP

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String username;
    private String displayName;
    private String favoriteTeam;
    private char notifPref;
    private String emailAddress;
    private String phone;
    private LocalDateTime createdAt;
    private OffsetDateTime updatedAt;

}
