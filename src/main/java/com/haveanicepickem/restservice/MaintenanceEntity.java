package com.haveanicepickem.restservice;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "maintenance")
public class MaintenanceEntity {

    @Id
    private String id;
    private boolean flag;
    private LocalDateTime createdAt;

}
