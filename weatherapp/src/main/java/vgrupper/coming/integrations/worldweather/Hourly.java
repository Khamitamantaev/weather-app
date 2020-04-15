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
        "time",
        "tempC",
        "tempF",
        "windspeedMiles",
        "windspeedKmph",
        "winddirDegree",
        "winddir16Point",
        "weatherCode",
        "weatherIconUrl",
        "weatherDesc",
        "precipMM",
        "precipInches",
        "humidity",
        "visibility",
        "visibilityMiles",
        "pressure",
        "pressureInches",
        "cloudcover",
        "HeatIndexC",
        "HeatIndexF",
        "DewPointC",
        "DewPointF",
        "WindChillC",
        "WindChillF",
        "WindGustMiles",
        "WindGustKmph",
        "FeelsLikeC",
        "FeelsLikeF",
        "chanceofrain",
        "chanceofremdry",
        "chanceofwindy",
        "chanceofovercast",
        "chanceofsunshine",
        "chanceoffrost",
        "chanceofhightemp",
        "chanceoffog",
        "chanceofsnow",
        "chanceofthunder",
        "uvIndex"
})
public class Hourly {

    @JsonProperty("time")
    private String time;
    @JsonProperty("tempC")
    private String tempC;
    @JsonProperty("tempF")
    private String tempF;
    @JsonProperty("windspeedMiles")
    private String windspeedMiles;
    @JsonProperty("windspeedKmph")
    private String windspeedKmph;
    @JsonProperty("winddirDegree")
    private String winddirDegree;
    @JsonProperty("winddir16Point")
    private String winddir16Point;
    @JsonProperty("weatherCode")
    private String weatherCode;
    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl_> weatherIconUrl = null;
    @JsonProperty("weatherDesc")
    private List<WeatherDesc_> weatherDesc = null;
    @JsonProperty("precipMM")
    private String precipMM;
    @JsonProperty("precipInches")
    private String precipInches;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("visibilityMiles")
    private String visibilityMiles;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("pressureInches")
    private String pressureInches;
    @JsonProperty("cloudcover")
    private String cloudcover;
    @JsonProperty("HeatIndexC")
    private String heatIndexC;
    @JsonProperty("HeatIndexF")
    private String heatIndexF;
    @JsonProperty("DewPointC")
    private String dewPointC;
    @JsonProperty("DewPointF")
    private String dewPointF;
    @JsonProperty("WindChillC")
    private String windChillC;
    @JsonProperty("WindChillF")
    private String windChillF;
    @JsonProperty("WindGustMiles")
    private String windGustMiles;
    @JsonProperty("WindGustKmph")
    private String windGustKmph;
    @JsonProperty("FeelsLikeC")
    private String feelsLikeC;
    @JsonProperty("FeelsLikeF")
    private String feelsLikeF;
    @JsonProperty("chanceofrain")
    private String chanceofrain;
    @JsonProperty("chanceofremdry")
    private String chanceofremdry;
    @JsonProperty("chanceofwindy")
    private String chanceofwindy;
    @JsonProperty("chanceofovercast")
    private String chanceofovercast;
    @JsonProperty("chanceofsunshine")
    private String chanceofsunshine;
    @JsonProperty("chanceoffrost")
    private String chanceoffrost;
    @JsonProperty("chanceofhightemp")
    private String chanceofhightemp;
    @JsonProperty("chanceoffog")
    private String chanceoffog;
    @JsonProperty("chanceofsnow")
    private String chanceofsnow;
    @JsonProperty("chanceofthunder")
    private String chanceofthunder;
    @JsonProperty("uvIndex")
    private String uvIndex;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("tempC")
    public String getTempC() {
        return tempC;
    }

    @JsonProperty("tempC")
    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    @JsonProperty("tempF")
    public String getTempF() {
        return tempF;
    }

    @JsonProperty("tempF")
    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    @JsonProperty("windspeedMiles")
    public String getWindspeedMiles() {
        return windspeedMiles;
    }

    @JsonProperty("windspeedMiles")
    public void setWindspeedMiles(String windspeedMiles) {
        this.windspeedMiles = windspeedMiles;
    }

    @JsonProperty("windspeedKmph")
    public String getWindspeedKmph() {
        return windspeedKmph;
    }

    @JsonProperty("windspeedKmph")
    public void setWindspeedKmph(String windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    @JsonProperty("winddirDegree")
    public String getWinddirDegree() {
        return winddirDegree;
    }

    @JsonProperty("winddirDegree")
    public void setWinddirDegree(String winddirDegree) {
        this.winddirDegree = winddirDegree;
    }

    @JsonProperty("winddir16Point")
    public String getWinddir16Point() {
        return winddir16Point;
    }

    @JsonProperty("winddir16Point")
    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    @JsonProperty("weatherCode")
    public String getWeatherCode() {
        return weatherCode;
    }

    @JsonProperty("weatherCode")
    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    @JsonProperty("weatherIconUrl")
    public List<WeatherIconUrl_> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    @JsonProperty("weatherIconUrl")
    public void setWeatherIconUrl(List<WeatherIconUrl_> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    @JsonProperty("weatherDesc")
    public List<WeatherDesc_> getWeatherDesc() {
        return weatherDesc;
    }

    @JsonProperty("weatherDesc")
    public void setWeatherDesc(List<WeatherDesc_> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    @JsonProperty("precipMM")
    public String getPrecipMM() {
        return precipMM;
    }

    @JsonProperty("precipMM")
    public void setPrecipMM(String precipMM) {
        this.precipMM = precipMM;
    }

    @JsonProperty("precipInches")
    public String getPrecipInches() {
        return precipInches;
    }

    @JsonProperty("precipInches")
    public void setPrecipInches(String precipInches) {
        this.precipInches = precipInches;
    }

    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("visibilityMiles")
    public String getVisibilityMiles() {
        return visibilityMiles;
    }

    @JsonProperty("visibilityMiles")
    public void setVisibilityMiles(String visibilityMiles) {
        this.visibilityMiles = visibilityMiles;
    }

    @JsonProperty("pressure")
    public String getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("pressureInches")
    public String getPressureInches() {
        return pressureInches;
    }

    @JsonProperty("pressureInches")
    public void setPressureInches(String pressureInches) {
        this.pressureInches = pressureInches;
    }

    @JsonProperty("cloudcover")
    public String getCloudcover() {
        return cloudcover;
    }

    @JsonProperty("cloudcover")
    public void setCloudcover(String cloudcover) {
        this.cloudcover = cloudcover;
    }

    @JsonProperty("HeatIndexC")
    public String getHeatIndexC() {
        return heatIndexC;
    }

    @JsonProperty("HeatIndexC")
    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    @JsonProperty("HeatIndexF")
    public String getHeatIndexF() {
        return heatIndexF;
    }

    @JsonProperty("HeatIndexF")
    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    @JsonProperty("DewPointC")
    public String getDewPointC() {
        return dewPointC;
    }

    @JsonProperty("DewPointC")
    public void setDewPointC(String dewPointC) {
        this.dewPointC = dewPointC;
    }

    @JsonProperty("DewPointF")
    public String getDewPointF() {
        return dewPointF;
    }

    @JsonProperty("DewPointF")
    public void setDewPointF(String dewPointF) {
        this.dewPointF = dewPointF;
    }

    @JsonProperty("WindChillC")
    public String getWindChillC() {
        return windChillC;
    }

    @JsonProperty("WindChillC")
    public void setWindChillC(String windChillC) {
        this.windChillC = windChillC;
    }

    @JsonProperty("WindChillF")
    public String getWindChillF() {
        return windChillF;
    }

    @JsonProperty("WindChillF")
    public void setWindChillF(String windChillF) {
        this.windChillF = windChillF;
    }

    @JsonProperty("WindGustMiles")
    public String getWindGustMiles() {
        return windGustMiles;
    }

    @JsonProperty("WindGustMiles")
    public void setWindGustMiles(String windGustMiles) {
        this.windGustMiles = windGustMiles;
    }

    @JsonProperty("WindGustKmph")
    public String getWindGustKmph() {
        return windGustKmph;
    }

    @JsonProperty("WindGustKmph")
    public void setWindGustKmph(String windGustKmph) {
        this.windGustKmph = windGustKmph;
    }

    @JsonProperty("FeelsLikeC")
    public String getFeelsLikeC() {
        return feelsLikeC;
    }

    @JsonProperty("FeelsLikeC")
    public void setFeelsLikeC(String feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    @JsonProperty("FeelsLikeF")
    public String getFeelsLikeF() {
        return feelsLikeF;
    }

    @JsonProperty("FeelsLikeF")
    public void setFeelsLikeF(String feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    @JsonProperty("chanceofrain")
    public String getChanceofrain() {
        return chanceofrain;
    }

    @JsonProperty("chanceofrain")
    public void setChanceofrain(String chanceofrain) {
        this.chanceofrain = chanceofrain;
    }

    @JsonProperty("chanceofremdry")
    public String getChanceofremdry() {
        return chanceofremdry;
    }

    @JsonProperty("chanceofremdry")
    public void setChanceofremdry(String chanceofremdry) {
        this.chanceofremdry = chanceofremdry;
    }

    @JsonProperty("chanceofwindy")
    public String getChanceofwindy() {
        return chanceofwindy;
    }

    @JsonProperty("chanceofwindy")
    public void setChanceofwindy(String chanceofwindy) {
        this.chanceofwindy = chanceofwindy;
    }

    @JsonProperty("chanceofovercast")
    public String getChanceofovercast() {
        return chanceofovercast;
    }

    @JsonProperty("chanceofovercast")
    public void setChanceofovercast(String chanceofovercast) {
        this.chanceofovercast = chanceofovercast;
    }

    @JsonProperty("chanceofsunshine")
    public String getChanceofsunshine() {
        return chanceofsunshine;
    }

    @JsonProperty("chanceofsunshine")
    public void setChanceofsunshine(String chanceofsunshine) {
        this.chanceofsunshine = chanceofsunshine;
    }

    @JsonProperty("chanceoffrost")
    public String getChanceoffrost() {
        return chanceoffrost;
    }

    @JsonProperty("chanceoffrost")
    public void setChanceoffrost(String chanceoffrost) {
        this.chanceoffrost = chanceoffrost;
    }

    @JsonProperty("chanceofhightemp")
    public String getChanceofhightemp() {
        return chanceofhightemp;
    }

    @JsonProperty("chanceofhightemp")
    public void setChanceofhightemp(String chanceofhightemp) {
        this.chanceofhightemp = chanceofhightemp;
    }

    @JsonProperty("chanceoffog")
    public String getChanceoffog() {
        return chanceoffog;
    }

    @JsonProperty("chanceoffog")
    public void setChanceoffog(String chanceoffog) {
        this.chanceoffog = chanceoffog;
    }

    @JsonProperty("chanceofsnow")
    public String getChanceofsnow() {
        return chanceofsnow;
    }

    @JsonProperty("chanceofsnow")
    public void setChanceofsnow(String chanceofsnow) {
        this.chanceofsnow = chanceofsnow;
    }

    @JsonProperty("chanceofthunder")
    public String getChanceofthunder() {
        return chanceofthunder;
    }

    @JsonProperty("chanceofthunder")
    public void setChanceofthunder(String chanceofthunder) {
        this.chanceofthunder = chanceofthunder;
    }

    @JsonProperty("uvIndex")
    public String getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uvIndex")
    public void setUvIndex(String uvIndex) {
        this.uvIndex = uvIndex;
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
        return "Hourly{" +
                "time='" + time + '\'' +
                ", tempC='" + tempC + '\'' +
                ", tempF='" + tempF + '\'' +
                ", windspeedMiles='" + windspeedMiles + '\'' +
                ", windspeedKmph='" + windspeedKmph + '\'' +
                ", winddirDegree='" + winddirDegree + '\'' +
                ", winddir16Point='" + winddir16Point + '\'' +
                ", weatherCode='" + weatherCode + '\'' +
                ", weatherIconUrl=" + weatherIconUrl +
                ", weatherDesc=" + weatherDesc +
                ", precipMM='" + precipMM + '\'' +
                ", precipInches='" + precipInches + '\'' +
                ", humidity='" + humidity + '\'' +
                ", visibility='" + visibility + '\'' +
                ", visibilityMiles='" + visibilityMiles + '\'' +
                ", pressure='" + pressure + '\'' +
                ", pressureInches='" + pressureInches + '\'' +
                ", cloudcover='" + cloudcover + '\'' +
                ", heatIndexC='" + heatIndexC + '\'' +
                ", heatIndexF='" + heatIndexF + '\'' +
                ", dewPointC='" + dewPointC + '\'' +
                ", dewPointF='" + dewPointF + '\'' +
                ", windChillC='" + windChillC + '\'' +
                ", windChillF='" + windChillF + '\'' +
                ", windGustMiles='" + windGustMiles + '\'' +
                ", windGustKmph='" + windGustKmph + '\'' +
                ", feelsLikeC='" + feelsLikeC + '\'' +
                ", feelsLikeF='" + feelsLikeF + '\'' +
                ", chanceofrain='" + chanceofrain + '\'' +
                ", chanceofremdry='" + chanceofremdry + '\'' +
                ", chanceofwindy='" + chanceofwindy + '\'' +
                ", chanceofovercast='" + chanceofovercast + '\'' +
                ", chanceofsunshine='" + chanceofsunshine + '\'' +
                ", chanceoffrost='" + chanceoffrost + '\'' +
                ", chanceofhightemp='" + chanceofhightemp + '\'' +
                ", chanceoffog='" + chanceoffog + '\'' +
                ", chanceofsnow='" + chanceofsnow + '\'' +
                ", chanceofthunder='" + chanceofthunder + '\'' +
                ", uvIndex='" + uvIndex + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}