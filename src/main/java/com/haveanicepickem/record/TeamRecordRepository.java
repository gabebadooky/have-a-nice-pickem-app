package com.haveanicepickem.record;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRecordRepository extends JpaRepository<TeamRecordEntity, TeamRecordId> {}
