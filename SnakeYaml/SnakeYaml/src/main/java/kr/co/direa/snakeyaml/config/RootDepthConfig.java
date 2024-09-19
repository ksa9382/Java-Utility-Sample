package kr.co.direa.snakeyaml.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * classpath:/root_config.yml에 있는 엘리먼트를 DI받음
 */
@Setter
@Getter
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
