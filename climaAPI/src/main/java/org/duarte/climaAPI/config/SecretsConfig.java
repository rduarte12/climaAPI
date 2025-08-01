package org.duarte.climaAPI.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:/secrets.properties")
public class SecretsConfig {
}
