package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.BettingOddsEntity;
import com.haveanicepickem.restservice.entity.BettingOddsId;

@Repository
public interface BettingOddsRepository extends JpaRepository<BettingOddsEntity, BettingOddsId> {}
