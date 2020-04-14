package vgrupper.coming.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;


//@Entity
public class City {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @JsonProperty("name")
//    private String name;
//
//    @JsonProperty("weatherProvider")
//    private String weatherProvider;
//
//    @JsonProperty("weather")
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "city")
//    private Weather weather;
//
//    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
//    private Date datecreated;
//
//    @PrePersist
//    public void onCreate(){
//        this.datecreated = new Date();
//    }
//
//    public City() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//
//    public String getWeatherProvider() {
//        return weatherProvider;
//    }
//
//    public void setWeatherProvider(String weatherProvider) {
//        this.weatherProvider = weatherProvider;
//    }
//
//
//    public Date getDatecreated() {
//        return datecreated;
//    }
//
//    public void setDatecreated(Date datecreated) {
//        this.datecreated = datecreated;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Weather getWeather() {
//        return weather;
//    }
//
//    public void setWeather(Weather weather) {
//        this.weather = weather;
//    }
//
//    @Override
//    public String toString() {
//        return "City{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", weatherProvider='" + weatherProvider + '\'' +
//                ", weather='" + weather + '\'' +
//                ", datecreated=" + datecreated +
//                '}';
//    }
}
