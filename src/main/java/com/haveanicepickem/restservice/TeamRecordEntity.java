package com.haveanicepickem.restservice;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "team_records")
public class TeamRecordEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private TeamEntity team;

    private String recordType;
    private byte wins;
    private byte losses;
    private byte ties;
    private OffsetDateTime updatedAt;

}
