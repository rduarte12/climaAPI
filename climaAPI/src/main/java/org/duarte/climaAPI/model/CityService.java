package org.duarte.climaAPI.model;

import org.duarte.climaAPI.dto.OpenWeatherAPI.WeatherApiDTO;

public interface CityService {

    void getCity();
    void setCity(String cityName);

}
