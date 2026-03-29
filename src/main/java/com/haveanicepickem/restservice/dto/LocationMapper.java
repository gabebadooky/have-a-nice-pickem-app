package com.haveanicepickem.restservice.dto;

import org.springframework.stereotype.Component;

import com.haveanicepickem.restservice.entity.LocationEntity;

@Component
public class LocationMapper {
    public LocationResponseDTO toDTO(LocationEntity location) {
        String stadium = location.getStadium();
        String city = location.getCity();
        String state = location.getState();
        Float latitude = location.getLatitude();
        Float longitude = location.getLongitude();

        return new LocationResponseDTO(
            stadium,
            city,
            state,
            latitude,
            longitude
        );
    }
}
