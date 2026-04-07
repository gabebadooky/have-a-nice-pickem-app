package com.haveanicepickem.matchup;

import com.haveanicepickem.competitor.CompetitorDTO;
import com.haveanicepickem.forecast.ForecastDTO;
import com.haveanicepickem.game.GameDTO;
import com.haveanicepickem.location.LocationDTO;

public record MatchupDTO(
    GameDTO game,
    LocationDTO location,
    ForecastDTO forecast,
    CompetitorDTO away,
    CompetitorDTO home
) {}
