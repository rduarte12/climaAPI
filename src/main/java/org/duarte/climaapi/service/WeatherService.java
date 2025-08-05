package org.duarte.climaapi.service;

import org.duarte.climaapi.client.OpenWeatherClient;
import org.duarte.climaapi.dto.openweather.OpenWeatherMapDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    private OpenWeatherClient openWeatherClient;
    private final String apiKey;

    public WeatherService(OpenWeatherClient openWeatherClient, @Value("${openweather.api.key}") String apiKey) {
        this.openWeatherClient = openWeatherClient;
        this.apiKey = apiKey;
    }

    public OpenWeatherMapDTO getWeatherByCity(String city) {
        return openWeatherClient.getCurrentWeather(city, apiKey, "metric");
    }
}
