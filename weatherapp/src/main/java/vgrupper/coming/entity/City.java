package vgrupper.coming.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;


@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("weatherProvider")
    private String weatherProvider;

    @JsonProperty("description")
    private String description;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private Date datecreated;

    @PrePersist
    public void onCreate(){
        this.datecreated = new Date();
    }

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherProvider() {
        return weatherProvider;
    }

    public void setWeatherProvider(String weatherProvider) {
        this.weatherProvider = weatherProvider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", weatherProvider='" + weatherProvider + '\'' +
                ", description='" + description + '\'' +
                ", datecreated=" + datecreated +
                '}';
    }
}
