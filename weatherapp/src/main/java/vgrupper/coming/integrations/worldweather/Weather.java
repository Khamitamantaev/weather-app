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
        "date",
        "astronomy",
        "maxtempC",
        "maxtempF",
        "mintempC",
        "mintempF",
        "avgtempC",
        "avgtempF",
        "totalSnow_cm",
        "sunHour",
        "uvIndex",
        "hourly"
})
public class Weather {

    @JsonProperty("date")
    private String date;
    @JsonProperty("astronomy")
    private List<Astronomy> astronomy = null;
    @JsonProperty("maxtempC")
    private String maxtempC;
    @JsonProperty("maxtempF")
    private String maxtempF;
    @JsonProperty("mintempC")
    private String mintempC;
    @JsonProperty("mintempF")
    private String mintempF;
    @JsonProperty("avgtempC")
    private String avgtempC;
    @JsonProperty("avgtempF")
    private String avgtempF;
    @JsonProperty("totalSnow_cm")
    private String totalSnowCm;
    @JsonProperty("sunHour")
    private String sunHour;
    @JsonProperty("uvIndex")
    private String uvIndex;
    @JsonProperty("hourly")
    private List<Hourly> hourly = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("astronomy")
    public List<Astronomy> getAstronomy() {
        return astronomy;
    }

    @JsonProperty("astronomy")
    public void setAstronomy(List<Astronomy> astronomy) {
        this.astronomy = astronomy;
    }

    @JsonProperty("maxtempC")
    public String getMaxtempC() {
        return maxtempC;
    }

    @JsonProperty("maxtempC")
    public void setMaxtempC(String maxtempC) {
        this.maxtempC = maxtempC;
    }

    @JsonProperty("maxtempF")
    public String getMaxtempF() {
        return maxtempF;
    }

    @JsonProperty("maxtempF")
    public void setMaxtempF(String maxtempF) {
        this.maxtempF = maxtempF;
    }

    @JsonProperty("mintempC")
    public String getMintempC() {
        return mintempC;
    }

    @JsonProperty("mintempC")
    public void setMintempC(String mintempC) {
        this.mintempC = mintempC;
    }

    @JsonProperty("mintempF")
    public String getMintempF() {
        return mintempF;
    }

    @JsonProperty("mintempF")
    public void setMintempF(String mintempF) {
        this.mintempF = mintempF;
    }

    @JsonProperty("avgtempC")
    public String getAvgtempC() {
        return avgtempC;
    }

    @JsonProperty("avgtempC")
    public void setAvgtempC(String avgtempC) {
        this.avgtempC = avgtempC;
    }

    @JsonProperty("avgtempF")
    public String getAvgtempF() {
        return avgtempF;
    }

    @JsonProperty("avgtempF")
    public void setAvgtempF(String avgtempF) {
        this.avgtempF = avgtempF;
    }

    @JsonProperty("totalSnow_cm")
    public String getTotalSnowCm() {
        return totalSnowCm;
    }

    @JsonProperty("totalSnow_cm")
    public void setTotalSnowCm(String totalSnowCm) {
        this.totalSnowCm = totalSnowCm;
    }

    @JsonProperty("sunHour")
    public String getSunHour() {
        return sunHour;
    }

    @JsonProperty("sunHour")
    public void setSunHour(String sunHour) {
        this.sunHour = sunHour;
    }

    @JsonProperty("uvIndex")
    public String getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uvIndex")
    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
    }

    @JsonProperty("hourly")
    public List<Hourly> getHourly() {
        return hourly;
    }

    @JsonProperty("hourly")
    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
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
        return "Weather{" +
                "date='" + date + '\'' +
                ", astronomy=" + astronomy +
                ", maxtempC='" + maxtempC + '\'' +
                ", maxtempF='" + maxtempF + '\'' +
                ", mintempC='" + mintempC + '\'' +
                ", mintempF='" + mintempF + '\'' +
                ", avgtempC='" + avgtempC + '\'' +
                ", avgtempF='" + avgtempF + '\'' +
                ", totalSnowCm='" + totalSnowCm + '\'' +
                ", sunHour='" + sunHour + '\'' +
                ", uvIndex='" + uvIndex + '\'' +
                ", hourly=" + hourly +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
