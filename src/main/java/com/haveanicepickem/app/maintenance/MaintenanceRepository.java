package com.haveanicepickem.app.maintenance;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository<MaintenanceEntity, Long> {
    
    Optional<MaintenanceEntity> findTopByOrderByIdDesc();

}
