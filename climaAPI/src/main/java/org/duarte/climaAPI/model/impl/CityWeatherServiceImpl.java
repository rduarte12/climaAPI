package org.duarte.climaAPI.model.impl;

import lombok.Getter;
import lombok.Setter;
import org.duarte.climaAPI.dto.OpenWeatherAPI.WeatherApiDTO;
import org.duarte.climaAPI.model.CityService;
import org.duarte.climaAPI.model.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class CityWeatherServiceImpl implements CityService {

    @Setter
    @Getter
    @Value("${tokenWeather}")
    private String apiKey;

    private String cityName;

    private WeatherService weatherService;

    @Override
    public void getCity() {
    }

    @Override
    public void setCity(String cityName) {
    }

    public WeatherApiDTO getWeather(String city) {
        return weatherService.getWeatherForOpenWeather(city, "metric", apiKey);
    }
}
