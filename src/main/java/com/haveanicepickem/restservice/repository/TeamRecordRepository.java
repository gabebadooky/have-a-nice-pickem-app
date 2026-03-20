package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.TeamRecordEntity;
import com.haveanicepickem.restservice.entity.TeamRecordId;

@Repository
public interface TeamRecordRepository extends JpaRepository<TeamRecordEntity, TeamRecordId> {}
