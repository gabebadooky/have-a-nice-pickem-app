package com.haveanicepickem.app.stats;

import org.springframework.stereotype.Component;

@Component
public class StatMapper {
    public StatDTO toDTO(StatEntity stat) {
        String statType = stat.getStatType();
        float statValue = stat.getStatValue();

        return new StatDTO(
            statType,
            statValue
        );
    }
}
