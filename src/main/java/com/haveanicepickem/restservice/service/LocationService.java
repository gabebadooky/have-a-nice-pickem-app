package com.haveanicepickem.restservice.service;

import org.springframework.stereotype.Service;

import com.haveanicepickem.restservice.dto.LocationMapper;
import com.haveanicepickem.restservice.dto.LocationResponseDTO;
import com.haveanicepickem.restservice.repository.LocationRepository;

@Service
public class LocationService {

    private LocationRepository locationRepository;
    private LocationMapper locationMapper;
    private String locationID;

    public LocationService(String locationID) {
        this.locationID = locationID;
    }

    public LocationResponseDTO getLocation() {
        return locationRepository.findById(locationID)
                                    .map(locationMapper::toDTO)
                                    .orElse(null);
    }

}
