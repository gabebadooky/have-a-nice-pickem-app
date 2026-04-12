package com.haveanicepickem.app.note;

import java.io.Serializable;
import java.util.Objects;

public class UserTeamNoteId implements Serializable {

    private Long userID;
    private String teamID;

    public UserTeamNoteId() {
    }

    public UserTeamNoteId(Long userID, String teamID) {
        this.userID = userID;
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

        // Cast `o` to UserTeamNotesId if we can confirm
        // `o` is not null, of a different class, or 
        // the same exact object
        UserTeamNoteId that = (UserTeamNoteId) o;

        boolean eq = (Objects.equals(userID, that.userID) &&
                        Objects.equals(teamID, that.teamID));

        return eq;
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, teamID);
    }

}
