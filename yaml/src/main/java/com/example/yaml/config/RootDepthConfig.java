package com.example.yaml.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * classpath:/root_config.yml에 있는 엘리먼트를 DI받음
 */
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "root")
public class RootDepthConfig {
    private String config1;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RootDepthConfig{");
        sb.append("config1='").append(config1).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
