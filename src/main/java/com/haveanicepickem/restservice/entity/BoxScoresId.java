package com.haveanicepickem.restservice.entity;

import java.io.Serializable;
import java.util.Objects;

public class BoxScoresId implements Serializable {

    private String gameID;
    private String teamID;

    public BoxScoresId(String gameID, String teamID) {
        this.gameID = gameID;
        this.teamID = teamID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        // Cast `o` to BoxScoresId if we can confirm
        // `o` is not null, of a different class, or 
        // the same exact object
        BoxScoresId that = (BoxScoresId) o;

        boolean eq = (Objects.equals(gameID, that.gameID) &&
                        Objects.equals(teamID, that.teamID));
        
        return eq;
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, teamID);
    }

}
