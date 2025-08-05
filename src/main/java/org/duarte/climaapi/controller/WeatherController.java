package org.duarte.climaapi.controller;

import org.duarte.climaapi.dto.openweather.OpenWeatherMapDTO;
import org.duarte.climaapi.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public ResponseEntity<OpenWeatherMapDTO> getWeather(@PathVariable String city) {
        OpenWeatherMapDTO weatherData = weatherService.getWeatherByCity(city);
        return ResponseEntity.ok(weatherData);
    }
}
