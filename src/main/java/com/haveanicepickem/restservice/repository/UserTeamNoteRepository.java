package com.haveanicepickem.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haveanicepickem.restservice.entity.UserTeamNoteEntity;
import com.haveanicepickem.restservice.entity.UserTeamNoteId;

@Repository
public interface UserTeamNoteRepository extends JpaRepository<UserTeamNoteEntity, UserTeamNoteId> {}
