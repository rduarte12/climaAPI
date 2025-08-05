package org.duarte.climaapi.dto.openweather;

import lombok.Data;

@Data
public class WindDTO {
    private Double speed;
    private Integer deg;
    private Double gust;
}
