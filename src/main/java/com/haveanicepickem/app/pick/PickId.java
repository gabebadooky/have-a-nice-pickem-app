package com.haveanicepickem.app.pick;

import java.io.Serializable;
import java.util.Objects;

public class PickId implements Serializable {

    private Long userID;
    private String gameID;

    public PickId(Long userID, String gameID) {
        this.userID = userID;
        this.gameID = gameID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        // Cast `o` to PickId if we can confirm `o` 
        // is not null, of a different class, or 
        // the same exact object
        PickId that = (PickId) o;

        boolean eq = (Objects.equals(userID, that.userID) &&
                        Objects.equals(gameID, that.gameID));
                        
        return eq;

    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, gameID);
    }

}
