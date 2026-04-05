package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.GameForecastEntity;

@Repository
public interface GameForecastRepository extends JpaRepository<GameForecastEntity, String> {}
