package com.haveanicepickem.location;

import org.springframework.stereotype.Component;

@Component
public class LocationMapper {
    public LocationDTO toDTO(LocationEntity location) {
        String stadium = location.getStadium();
        String city = location.getCity();
        String state = location.getState();
        Float latitude = location.getLatitude();
        Float longitude = location.getLongitude();

        return new LocationDTO(
            stadium,
            city,
            state,
            latitude,
            longitude
        );
    }
}
