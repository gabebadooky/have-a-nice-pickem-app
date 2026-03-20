package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haveanicepickem.restservice.entity.PickEntity;
import com.haveanicepickem.restservice.entity.PickId;

public interface PickRepository extends JpaRepository<PickEntity, PickId> {}
