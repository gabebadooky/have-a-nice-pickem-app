package com.haveanicepickem.app.matchup;

import com.haveanicepickem.app.competitor.CompetitorDTO;
import com.haveanicepickem.app.forecast.ForecastDTO;
import com.haveanicepickem.app.game.GameDTO;
import com.haveanicepickem.app.location.LocationDTO;

public record MatchupDTO(
    GameDTO game,
    LocationDTO location,
    ForecastDTO forecast,
    CompetitorDTO away,
    CompetitorDTO home
) {}
