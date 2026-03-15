package com.haveanicepickem.restservice;

import java.time.OffsetDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "locations")
public class LocationEntity {

    @Id
    private String id;
    private String stadium;
    private String city;
    private String state;
    private float latitude;
    private float longitude;
    private OffsetDateTime updatedAt;

}
