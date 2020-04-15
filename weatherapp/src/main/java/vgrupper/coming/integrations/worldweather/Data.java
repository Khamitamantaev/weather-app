package vgrupper.coming.integrations.worldweather;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "request",
        "current_condition",
        "weather",
        "ClimateAverages"
})
public class Data {

    @JsonProperty("request")
    private List<Request> request = null;
    @JsonProperty("current_condition")
    private List<CurrentCondition> currentCondition = null;
    @JsonProperty("weather")
    private List<Weather> weather = null;
    @JsonProperty("ClimateAverages")
    private List<ClimateAverage> climateAverages = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("request")
    public List<Request> getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(List<Request> request) {
        this.request = request;
    }

    @JsonProperty("current_condition")
    public List<CurrentCondition> getCurrentCondition() {
        return currentCondition;
    }

    @JsonProperty("current_condition")
    public void setCurrentCondition(List<CurrentCondition> currentCondition) {
        this.currentCondition = currentCondition;
    }

    @JsonProperty("weather")
    public List<Weather> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @JsonProperty("ClimateAverages")
    public List<ClimateAverage> getClimateAverages() {
        return climateAverages;
    }

    @JsonProperty("ClimateAverages")
    public void setClimateAverages(List<ClimateAverage> climateAverages) {
        this.climateAverages = climateAverages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "request=" + request +
                ", currentCondition=" + currentCondition +
                ", weather=" + weather +
                ", climateAverages=" + climateAverages +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
