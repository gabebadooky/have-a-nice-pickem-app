package com.haveanicepickem.restservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.StatEntity;
import com.haveanicepickem.restservice.entity.StatId;

@Repository
public interface StatRepository extends JpaRepository<StatEntity, StatId> {

    public Optional<List<StatEntity>> findByGameIdAndTeamId(String gameID, String teamID);

    public Optional<List<StatEntity>> findByTeamId(String teamID);

}
