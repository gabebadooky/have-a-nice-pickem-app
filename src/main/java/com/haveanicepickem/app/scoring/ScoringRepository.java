package com.haveanicepickem.app.scoring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoringRepository extends JpaRepository<ScoringEntity, String> {}
