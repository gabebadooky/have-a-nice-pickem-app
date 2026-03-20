package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.MaintenanceEntity;

@Repository
public interface MaintenanceRepository extends JpaRepository<MaintenanceEntity, Long> {}
