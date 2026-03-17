package com.haveanicepickem.restservice.entity;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
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
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String displayName;
    
    @Column(nullable = false)
    private String favoriteTeam;
    
    @Column(name = "notifPref", nullable = false)
    private char notificationPreference;
    
    @Column(nullable = false)
    private String emailAddress;
    
    @Column(nullable = false)
    private String phone;
    
    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @ColumnDefault("current_timestamp")
    private OffsetDateTime updatedAt;

}
