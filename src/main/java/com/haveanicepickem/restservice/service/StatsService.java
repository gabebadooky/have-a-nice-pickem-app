package com.haveanicepickem.restservice.service;

import java.util.List;

import com.haveanicepickem.restservice.dto.StatsResponseDTO;

public interface StatsService {
    List<StatsResponseDTO> getStats();
}
