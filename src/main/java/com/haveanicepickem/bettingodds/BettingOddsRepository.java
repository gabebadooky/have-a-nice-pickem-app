package com.haveanicepickem.bettingodds;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BettingOddsRepository extends JpaRepository<BettingOddsEntity, BettingOddsId> {

    Optional<List<BettingOddsEntity>> findByGameIdAndTeamId(String gameID, String teamID);

}
