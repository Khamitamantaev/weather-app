package vgrupper.coming.integrations.worldweather;

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
        "index",
        "name",
        "avgMinTemp",
        "avgMinTemp_F",
        "absMaxTemp",
        "absMaxTemp_F",
        "avgDailyRainfall"
})
public class Month {

    @JsonProperty("index")
    private String index;
    @JsonProperty("name")
    private String name;
    @JsonProperty("avgMinTemp")
    private String avgMinTemp;
    @JsonProperty("avgMinTemp_F")
    private String avgMinTempF;
    @JsonProperty("absMaxTemp")
    private String absMaxTemp;
    @JsonProperty("absMaxTemp_F")
    private String absMaxTempF;
    @JsonProperty("avgDailyRainfall")
    private String avgDailyRainfall;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("avgMinTemp")
    public String getAvgMinTemp() {
        return avgMinTemp;
    }

    @JsonProperty("avgMinTemp")
    public void setAvgMinTemp(String avgMinTemp) {
        this.avgMinTemp = avgMinTemp;
    }

    @JsonProperty("avgMinTemp_F")
    public String getAvgMinTempF() {
        return avgMinTempF;
    }

    @JsonProperty("avgMinTemp_F")
    public void setAvgMinTempF(String avgMinTempF) {
        this.avgMinTempF = avgMinTempF;
    }

    @JsonProperty("absMaxTemp")
    public String getAbsMaxTemp() {
        return absMaxTemp;
    }

    @JsonProperty("absMaxTemp")
    public void setAbsMaxTemp(String absMaxTemp) {
        this.absMaxTemp = absMaxTemp;
    }

    @JsonProperty("absMaxTemp_F")
    public String getAbsMaxTempF() {
        return absMaxTempF;
    }

    @JsonProperty("absMaxTemp_F")
    public void setAbsMaxTempF(String absMaxTempF) {
        this.absMaxTempF = absMaxTempF;
    }

    @JsonProperty("avgDailyRainfall")
    public String getAvgDailyRainfall() {
        return avgDailyRainfall;
    }

    @JsonProperty("avgDailyRainfall")
    public void setAvgDailyRainfall(String avgDailyRainfall) {
        this.avgDailyRainfall = avgDailyRainfall;
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
        return "Month{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", avgMinTemp='" + avgMinTemp + '\'' +
                ", avgMinTempF='" + avgMinTempF + '\'' +
                ", absMaxTemp='" + absMaxTemp + '\'' +
                ", absMaxTempF='" + absMaxTempF + '\'' +
                ", avgDailyRainfall='" + avgDailyRainfall + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
