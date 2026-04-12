package com.haveanicepickem.app.location;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    public LocationService(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    public LocationDTO getLocation(String locationID) {
        return locationRepository.findById(locationID)
                                    .map(locationMapper::toDTO)
                                    .orElse(null);
    }

}
