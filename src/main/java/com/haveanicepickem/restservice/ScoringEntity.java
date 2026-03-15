package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "scoring")
public class ScoringEntity {

    private char confidence;
    private byte reward;
    private byte penalty;
    private LocalDateTime updatedAt;
    
}
