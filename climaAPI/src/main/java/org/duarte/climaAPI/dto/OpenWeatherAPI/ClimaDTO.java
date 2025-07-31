package org.duarte.climaAPI.dto.OpenWeatherAPI;

import lombok.Data;

@Data
public class ClimaDTO {

    private String temp;
    private String feels_like;
    private String humidity;
    private ClimaAtualDTO weather;
}
