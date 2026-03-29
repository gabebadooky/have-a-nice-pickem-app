package com.haveanicepickem.restservice.dto;

import org.springframework.stereotype.Component;

import com.haveanicepickem.restservice.entity.StatEntity;

@Component
public class StatMapper {
    public StatsResponseDTO toDTO(StatEntity stat) {
        String statType = stat.getStatType();
        float statValue = stat.getStatValue();

        return new StatsResponseDTO(
            statType,
            statValue
        );
    }
}
