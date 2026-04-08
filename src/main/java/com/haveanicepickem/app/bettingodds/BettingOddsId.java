package com.haveanicepickem.app.bettingodds;

import java.io.Serializable;
import java.util.Objects;

public class BettingOddsId implements Serializable {

    private String gameID;
    private String teamID;
    private String source;

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

        // Cast `o` to BettingOddsId if we can confirm
        // `o` is not null, of a different class, or 
        // the same exact object
        BettingOddsId that = (BettingOddsId) o;

        boolean eq = (Objects.equals(gameID, that.gameID) && 
                        Objects.equals(teamID, that.teamID) &&
                        Objects.equals(source, that.source));

        return eq;

    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, teamID, source);
    }

}
