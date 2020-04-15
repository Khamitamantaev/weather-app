package vgrupper.coming.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String city;

    private Integer weatherId;

    private double temperature;

    private Instant timestamp;

    private String weatherappi;


    public WeatherEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(Integer weatherId) {
        this.weatherId = weatherId;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getWeatherappi() {
        return weatherappi;
    }

    public void setWeatherappi(String weatherappi) {
        this.weatherappi = weatherappi;
    }

    @Override
    public String toString() {
        return "WeatherEntity{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", weatherId=" + weatherId +
                ", temperature=" + temperature +
                ", timestamp=" + timestamp +
                ", weatherappi='" + weatherappi + '\'' +
                '}';
    }
}
