package vgrupper.coming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import vgrupper.coming.integrations.Weather;


@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
public class WeatherApp {

    private static final Logger log = LoggerFactory.getLogger(WeatherApp.class);

    public static void main(String[] args) {
        SpringApplication.run(WeatherApp.class, args);
    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

}