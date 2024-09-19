package kr.co.direa.snakeyaml.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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
