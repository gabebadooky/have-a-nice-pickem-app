package com.haveanicepickem.app.maintenance;

import org.springframework.stereotype.Service;

@Service
public class MaintenanceService {

    private MaintenanceRepository maintenanceRepository;
    private MaintenanceMapper maintenanceMapper;

    public MaintenanceService() {}

    public MaintenanceDTO getMaintenanceStatus() {
        return maintenanceRepository.findTopByOrderByIdDesc()
                                        .map(maintenanceMapper::toDTO)
                                        .orElse(null);
    }

}
