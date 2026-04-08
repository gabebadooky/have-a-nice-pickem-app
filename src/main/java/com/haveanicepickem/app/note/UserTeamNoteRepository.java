package com.haveanicepickem.app.note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTeamNoteRepository extends JpaRepository<UserTeamNoteEntity, UserTeamNoteId> {}
