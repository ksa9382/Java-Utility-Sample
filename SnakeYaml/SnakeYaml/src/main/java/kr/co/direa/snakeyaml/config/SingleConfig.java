package kr.co.direa.snakeyaml.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * application.yml
 * single-config 테스트
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "single-config")
public class SingleConfig {
    private String config_string;
    private int config_int;
    private double config_double;
    private boolean config_boolean;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingleConfig{");
        sb.append("\n\tconfig_string='").append(config_string).append('\'');
        sb.append("\n\tconfig_int='").append(config_int).append('\'');
        sb.append("\n\tconfig_double='").append(config_double).append('\'');
        sb.append("\n\tconfig_boolean='").append(config_boolean).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
