package org.duarte.climaAPI.model;


import org.duarte.climaAPI.dto.OpenWeatherAPI.WeatherApiDTO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "OpenWeatherMap", url = "https://api.openweathermap.org")
public interface WeatherService {

    @GetMapping("/data/2.5/weather?")
    WeatherApiDTO getWeatherForOpenWeather(
            @RequestParam("q") String city,
            @RequestParam("units") String units,
            @RequestParam("appid") @Value("${tokenWeather}") String apiKey
    );

}
