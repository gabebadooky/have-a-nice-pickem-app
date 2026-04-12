package com.haveanicepickem.app.boxscore;

import java.io.Serializable;
import java.util.Objects;

public class BoxScoresId implements Serializable {

    private String gameID;
    private String teamID;

    public BoxScoresId() {
    }

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

        BoxScoresId that = (BoxScoresId) o;

        return Objects.equals(gameID, that.gameID)
                && Objects.equals(teamID, that.teamID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, teamID);
    }

}
