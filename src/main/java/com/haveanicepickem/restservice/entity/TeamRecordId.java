package com.haveanicepickem.restservice.entity;

import java.io.Serializable;
import java.util.Objects;

public class TeamRecordId implements Serializable {

    private String teamId;
    private String recordType;

    public TeamRecordId(String teamId, String recordType) {
        this.teamId = teamId;
        this.recordType = recordType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || getClass() != o.getClass()) {
            return false;
        }

        // Cast `o` to TeamRecordId if we can confirm
        // `o` is not null, of a different class, or 
        // the same exact object
        TeamRecordId that = (TeamRecordId) o;

        boolean eq = (Objects.equals(teamId, that.teamId) &&
                                Objects.equals(recordType, that.recordType));
        return eq;

    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, recordType);
    }

}
