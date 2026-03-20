package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.PredictionEntity;
import com.haveanicepickem.restservice.entity.PredictionId;

@Repository
public interface PredictionRepository extends JpaRepository<PredictionEntity, PredictionId> {}
