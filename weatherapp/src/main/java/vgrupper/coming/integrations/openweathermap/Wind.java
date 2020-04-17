
package vgrupper.coming.integrations.openweathermap;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "speed",
    "deg",
    "gust"
})
public class Wind {

    @JsonProperty("speed")
    private long speed;
    @JsonProperty("deg")
    private long deg;
    @JsonProperty("gust")
    private long gust;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param deg
     * @param speed
     * @param gust
     */
    public Wind(long speed, long deg, long gust) {
        super();
        this.speed = speed;
        this.deg = deg;
        this.gust = gust;
    }

    @JsonProperty("speed")
    public long getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(long speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public long getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(long deg) {
        this.deg = deg;
    }

    @JsonProperty("gust")
    public long getGust() {
        return gust;
    }

    @JsonProperty("gust")
    public void setGust(long gust) {
        this.gust = gust;
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
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                ", gust=" + gust +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
