package com.haveanicepickem.app.prediction;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private final PredictionRepository predictionRepository;
    private final PredictionMapper predictionMapper;

    public PredictionService(PredictionRepository predictionRepository, PredictionMapper predictionMapper) {
        this.predictionRepository = predictionRepository;
        this.predictionMapper = predictionMapper;
    }

    public PredictionDTO getPrediction(Long userID, String predictionCode) {
        PredictionId predictionIdentifier = new PredictionId(userID, predictionCode);
        return predictionRepository.findById(predictionIdentifier)
                                    .map(predictionMapper::toDTO)
                                    .orElse(null);
    }

    public List<PredictionDTO> getAllUserPredictions(Long userID) {
        return predictionRepository.findAllByUserID_Id(userID)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(predictionMapper::toDTO)
                                    .toList();
    }

    public List<PredictionDTO> getAllPredictionsByCode(String predictionCode) {
        return predictionRepository.findAllByPredictionCode(predictionCode)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(predictionMapper::toDTO)
                                    .toList();
    }

}
