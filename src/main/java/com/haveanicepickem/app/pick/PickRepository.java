package com.haveanicepickem.app.pick;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PickRepository extends JpaRepository<PickEntity, PickId> {

    Optional<List<PickEntity>> findAllByUserID(Long userID);

}
