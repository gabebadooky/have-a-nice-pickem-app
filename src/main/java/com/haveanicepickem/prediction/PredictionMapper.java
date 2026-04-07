package com.haveanicepickem.prediction;

import org.springframework.stereotype.Component;

@Component
public class PredictionMapper {

    public PredictionDTO toDTO(PredictionEntity prediction) {
        String predictionDescription = prediction.getPredictionDescription();
        String predictionSelection = prediction.getPredictionSelection();

        return new PredictionDTO(
            predictionDescription,
            predictionSelection
        );
    }

}
