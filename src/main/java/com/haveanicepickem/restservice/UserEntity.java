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
