package kr.co.direa.snakeyaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan(basePackages = "kr.co.direa.snakeyaml.config")
@SpringBootApplication
public class SnakeYamlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnakeYamlApplication.class, args);
	}

}
