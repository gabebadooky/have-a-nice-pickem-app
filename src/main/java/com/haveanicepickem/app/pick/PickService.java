package com.haveanicepickem.app.pick;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PickService {

    private PickRepository pickRepository;
    private PickMapper pickMapper;
    private Long userID;
    private String teamID;

    public PickService(Long userID, String teamID) {
        this.userID = userID;
        this.teamID = teamID;
    }

    public PickService(Long userID) {
        this.userID = userID;
    }

    public PickDTO getPick() {
        PickId pickIdentifier = new PickId(userID, teamID);
        return pickRepository.findById(pickIdentifier)
                                .map(pickMapper::toDTO)
                                .orElse(null);
    }

    public List<PickDTO> getPicksByUserID() {
        return pickRepository.findAllByUserID(userID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(pickMapper::toDTO)
                                .toList();
    }

}
