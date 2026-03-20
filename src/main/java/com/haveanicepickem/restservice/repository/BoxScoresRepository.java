package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.BoxScoresEntity;
import com.haveanicepickem.restservice.entity.BoxScoresId;

@Repository
public interface BoxScoresRepository extends JpaRepository<BoxScoresEntity, BoxScoresId> {}
