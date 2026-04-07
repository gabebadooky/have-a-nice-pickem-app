package com.haveanicepickem.maintenance;

import org.springframework.stereotype.Component;

@Component
public class MaintenanceMapper {

    public MaintenanceDTO toDTO(MaintenanceEntity maintenance) {
        boolean flag = maintenance.getFlag();

        return new MaintenanceDTO(flag);
    }

}
