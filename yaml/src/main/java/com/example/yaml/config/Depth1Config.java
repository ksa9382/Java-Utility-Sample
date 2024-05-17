package com.example.yaml.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "depth1")
public class Depth1Config {
    private String config1;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Depth1Config{");
        sb.append("config1='").append(config1).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
