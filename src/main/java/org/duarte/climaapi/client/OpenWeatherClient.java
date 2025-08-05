package org.duarte.climaapi.client;

import org.duarte.climaapi.dto.openweather.OpenWeatherMapDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "openweather", url = "${openweather.api.url}")
public interface OpenWeatherClient {

    @GetMapping("/weather")
    OpenWeatherMapDTO getCurrentWeather(
            @RequestParam("q") String city,
            @RequestParam("appid") String apiKey,
            @RequestParam("units") String units
    );
}
