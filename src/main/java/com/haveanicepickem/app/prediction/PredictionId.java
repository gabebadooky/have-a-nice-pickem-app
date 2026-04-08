package com.haveanicepickem.app.prediction;

import java.io.Serializable;
import java.util.Objects;

public class PredictionId implements Serializable {

    private Long userID;
    private String predictionCode;

    public PredictionId(Long userID, String predictionCode) {
        this.userID = userID;
        this.predictionCode = predictionCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        // Cast `o` to PredictionId if we can confirm
        // `o` is not null, of a different class, or 
        // the same exact object
        PredictionId that = (PredictionId) o;

        boolean eq = (Objects.equals(userID, that.userID) &&
                                        Objects.equals(predictionCode, that.predictionCode));
        
        return eq;

    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, predictionCode);
    }

}
