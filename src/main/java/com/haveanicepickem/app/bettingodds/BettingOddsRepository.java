package com.haveanicepickem.app.bettingodds;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BettingOddsRepository extends JpaRepository<BettingOddsEntity, BettingOddsId> {

    Optional<List<BettingOddsEntity>> findAllByGameIdAndTeamId(String gameID, String teamID);

}
