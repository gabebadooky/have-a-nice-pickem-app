package com.haveanicepickem.app.location;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private LocationRepository locationRepository;
    private LocationMapper locationMapper;
    private String locationID;

    public LocationService(String locationID) {
        this.locationID = locationID;
    }

    public LocationDTO getLocation() {
        return locationRepository.findById(locationID)
                                    .map(locationMapper::toDTO)
                                    .orElse(null);
    }

}
