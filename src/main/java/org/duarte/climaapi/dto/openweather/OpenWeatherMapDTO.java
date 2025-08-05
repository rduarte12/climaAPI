package org.duarte.climaapi.dto.openweather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class OpenWeatherMapDTO {
    @JsonProperty("coord")
    private CoordDTO coordinates;

    private List<WeatherInfoDTO> weather;
    private MainInfoDTO main;
    private WindDTO wind;
    private String name; //nome da cidade
    private Long id;
}
