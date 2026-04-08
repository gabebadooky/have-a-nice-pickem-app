package com.haveanicepickem.app.prediction;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends JpaRepository<PredictionEntity, PredictionId> {

    Optional<List<PredictionEntity>> findAllByUserID(Long userID);

    Optional<List<PredictionEntity>> findAllByPredictionCode(String predictionCode);

}
