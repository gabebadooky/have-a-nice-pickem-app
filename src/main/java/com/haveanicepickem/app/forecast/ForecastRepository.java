package com.haveanicepickem.app.forecast;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepository extends JpaRepository<ForecastEntity, String> {}
