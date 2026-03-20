package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.ScoringEntity;

@Repository
public interface ScoringRepository extends JpaRepository<ScoringEntity, String> {}
