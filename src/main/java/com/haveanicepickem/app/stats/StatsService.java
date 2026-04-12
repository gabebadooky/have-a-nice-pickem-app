package com.haveanicepickem.app.stats;

import java.util.List;

public interface StatsService {
    List<StatDTO> getStats(String gameID, String teamID);
}
