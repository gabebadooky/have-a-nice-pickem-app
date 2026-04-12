package com.haveanicepickem.app.stats;

import java.io.Serializable;
import java.util.Objects;

public class StatId implements Serializable {

    private String gameID;
    private String teamID;
    private String statType;

    public StatId() {
    }

    public StatId(String gameID, String teamID, String statType) {
        this.gameID = gameID;
        this.teamID = teamID;
        this.statType = statType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != this.getClass())) {
            return false;
        }

        StatId that = (StatId) o;

        return Objects.equals(gameID, that.gameID)
                && Objects.equals(teamID, that.teamID)
                && Objects.equals(statType, that.statType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, teamID, statType);
    }

}
