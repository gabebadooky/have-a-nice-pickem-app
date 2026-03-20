package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.StatEntity;
import com.haveanicepickem.restservice.entity.StatId;

@Repository
public interface StatRepository extends JpaRepository<StatEntity, StatId> {}
