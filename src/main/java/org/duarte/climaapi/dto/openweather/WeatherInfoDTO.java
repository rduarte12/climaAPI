package org.duarte.climaapi.dto.openweather;

import lombok.Data;

@Data
public class WeatherInfoDTO {
    private Integer id;
    private String main;
    private String description;
    private String icon;
}
