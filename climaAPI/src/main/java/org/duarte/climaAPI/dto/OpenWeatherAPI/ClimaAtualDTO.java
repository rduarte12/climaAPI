package org.duarte.climaAPI.dto.OpenWeatherAPI;

import java.util.List;

public class ClimaAtualDTO {

    private Double temp;
    private Double feels_like;
    private Integer humidity;
    private List<ClimaDetalhesDTO> weather;
}
