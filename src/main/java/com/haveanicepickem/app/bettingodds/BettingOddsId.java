package com.haveanicepickem.app.bettingodds;

import java.io.Serializable;
import java.util.Objects;

public class BettingOddsId implements Serializable {

    private String gameID;
    private String teamID;
    private String source;

    public BettingOddsId() {
    }

    public BettingOddsId(String gameID, String teamID, String source) {
        this.gameID = gameID;
        this.teamID = teamID;
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || getClass() != o.getClass()) {
            return false;
        }

        BettingOddsId that = (BettingOddsId) o;

        return Objects.equals(gameID, that.gameID)
                && Objects.equals(teamID, that.teamID)
                && Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, teamID, source);
    }

}
