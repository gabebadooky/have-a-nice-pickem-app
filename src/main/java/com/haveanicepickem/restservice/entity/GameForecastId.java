package com.haveanicepickem.restservice.entity;

import java.io.Serializable;
import java.util.Objects;

public class GameForecastId implements Serializable {

    private String gameID;
    private String locationID;

    public GameForecastId(String gameID, String locationID) {
        this.gameID = gameID;
        this.locationID = locationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || getClass() != o.getClass()) {
            return false;
        }

        // Cast `o` to GameForecastId if we can confirm
        // `o` is not null, of a different class, or 
        // the same exact object
        GameForecastId that = (GameForecastId) o;

        boolean eq = (Objects.equals(gameID, that.gameID) &&
                        Objects.equals(locationID, that.locationID));
        
        return eq;

    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, locationID);
    }

}
