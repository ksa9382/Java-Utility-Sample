package com.example.yaml.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * application.yml
 * array-config Å×½ºÆ®
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "array-config")
public class ArrayConfig {
    private List<String> servers1 = new ArrayList<>();
    private List<String> servers2 = new ArrayList<>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppConfig{\n");
        sb.append("\tservers1=").append(servers1).append("\n");
        sb.append("\t, servers2=").append(servers2).append("\n");
        sb.append('}');
        return sb.toString();
    }
}