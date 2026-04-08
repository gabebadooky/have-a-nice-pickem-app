package com.haveanicepickem.app.prediction;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    private PredictionRepository predictionRepository;
    private PredictionMapper predictionMapper;
    private Long userID;
    private String predictionCode;

    public PredictionService(Long userID, String predictionCode) {
        this.userID = userID;
        this.predictionCode = predictionCode;
    }

    public PredictionService(Long userID) {
        this.userID = userID;
    }

    public PredictionService(String predictionCode) {
        this.predictionCode = predictionCode;
    }

    public PredictionDTO getPrediction() {
        PredictionId predictionIdentifier = new PredictionId(userID, predictionCode);
        return predictionRepository.findById(predictionIdentifier)
                                    .map(predictionMapper::toDTO)
                                    .orElse(null);
    }

    public List<PredictionDTO> getAllUserPredictions() {
        return predictionRepository.findAllByUserID(userID)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(predictionMapper::toDTO)
                                    .toList();
    }



    public List<PredictionDTO> getAllPredictionsByCode() {
        return predictionRepository.findAllByPredictionCode(predictionCode)
                                    .orElse(Collections.emptyList())
                                    .stream()
                                    .map(predictionMapper::toDTO)
                                    .toList();
    }

}
