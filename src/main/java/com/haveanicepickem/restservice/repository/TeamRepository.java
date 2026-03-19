package com.haveanicepickem.restservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.TeamEntity;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, String> {

    // WHERE id = ?
    Optional<TeamEntity> findById(String teamID);

}
