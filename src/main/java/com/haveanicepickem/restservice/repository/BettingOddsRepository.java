package com.haveanicepickem.restservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.entity.BettingOddsId;

@Repository
public interface BettingOddsRepository extends JpaRepository<BettingOddsEntity, BettingOddsId> {

    Optional<List<BettingOddsEntity>> findByGameIdAndTeamId(String gameID, String teamID);

}
