package com.haveanicepickem.app.stats;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends JpaRepository<StatEntity, StatId> {

    public Optional<List<StatEntity>> findByGameID_IdAndTeamID_Id(String gameID, String teamID);

    public Optional<List<StatEntity>> findByTeamID_Id(String teamID);

}
