package com.haveanicepickem.app.pick;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PickService {

    private PickRepository pickRepository;
    private PickMapper pickMapper;

    public PickService(PickRepository pickRepository, PickMapper pickMapper) {
        this.pickRepository = pickRepository;
        this.pickMapper = pickMapper;
    }


    public PickDTO getPick(Long userID, String teamID) {
        PickId pickIdentifier = new PickId(userID, teamID);
        return pickRepository.findById(pickIdentifier)
                                .map(pickMapper::toDTO)
                                .orElse(null);
    }

    public List<PickDTO> getPicksByUserID(Long userID) {
        return pickRepository.findAllByUserID_Id(userID)
                                .orElse(Collections.emptyList())
                                .stream()
                                .map(pickMapper::toDTO)
                                .toList();
    }

}
