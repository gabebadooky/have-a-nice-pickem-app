package com.haveanicepickem.app.boxscore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxScoresRepository extends JpaRepository<BoxScoresEntity, BoxScoresId> {}
