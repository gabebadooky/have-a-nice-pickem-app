package com.haveanicepickem.stats;

import java.io.Serializable;
import java.util.Objects;

public class StatId implements Serializable {

    private String gameID;
    private String teamID;
    private String statType;

    public StatId(String gameID, String teamID, String statType) {
        this.gameID = gameID;
        this.teamID = teamID;
        this.statType = statType;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != this.getClass())) {
            return false;
        }

        // Cast `o` to StatId if we can confirm`o` 
        // is not null, of a different class, or 
        // the same exact object
        StatId that = (StatId) o;

        boolean eq = (Objects.equals(gameID, that.gameID) &&
                        Objects.equals(teamID, that.teamID) &&
                        Objects.equals(statType, that.statType));
        
        return eq;

    }

    public int hashCode () {
        return Objects.hash(gameID, teamID, statType);
    }

}
