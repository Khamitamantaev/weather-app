package vgrupper.coming.integrations;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Weatherwb {

    @JsonProperty("rh")
    private long rh;
    @JsonProperty("pod")
    private String pod;
    @JsonProperty("lon")
    private double lon;
    @JsonProperty("pres")
    private long pres;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("ob_time")
    private String obTime;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("clouds")
    private long clouds;
    @JsonProperty("ts")
    private long ts;
    @JsonProperty("solar_rad")
    private double solarRad;
    @JsonProperty("state_code")
    private String stateCode;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("wind_spd")
    private long windSpd;
    @JsonProperty("last_ob_time")
    private String lastObTime;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("slp")
    private long slp;
    @JsonProperty("vis")
    private long vis;
    @JsonProperty("h_angle")
    private double hAngle;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("dni")
    private double dni;
    @JsonProperty("dewpt")
    private long dewpt;
    @JsonProperty("snow")
    private long snow;
    @JsonProperty("uv")
    private double uv;
    @JsonProperty("precip")
    private long precip;
    @JsonProperty("wind_dir")
    private long windDir;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("ghi")
    private double ghi;
    @JsonProperty("dhi")
    private double dhi;
    @JsonProperty("aqi")
    private long aqi;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("weather")
    private Weather weather;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("temp")
    private long temp;
    @JsonProperty("station")
    private String station;
    @JsonProperty("elev_angle")
    private double elevAngle;
    @JsonProperty("app_temp")
    private double appTemp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rh")
    public long getRh() {
        return rh;
    }

    @JsonProperty("rh")
    public void setRh(long rh) {
        this.rh = rh;
    }

    @JsonProperty("pod")
    public String getPod() {
        return pod;
    }

    @JsonProperty("pod")
    public void setPod(String pod) {
        this.pod = pod;
    }

    @JsonProperty("lon")
    public double getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(double lon) {
        this.lon = lon;
    }

    @JsonProperty("pres")
    public long getPres() {
        return pres;
    }

    @JsonProperty("pres")
    public void setPres(long pres) {
        this.pres = pres;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("ob_time")
    public String getObTime() {
        return obTime;
    }

    @JsonProperty("ob_time")
    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("clouds")
    public long getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(long clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("ts")
    public long getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(long ts) {
        this.ts = ts;
    }

    @JsonProperty("solar_rad")
    public double getSolarRad() {
        return solarRad;
    }

    @JsonProperty("solar_rad")
    public void setSolarRad(double solarRad) {
        this.solarRad = solarRad;
    }

    @JsonProperty("state_code")
    public String getStateCode() {
        return stateCode;
    }

    @JsonProperty("state_code")
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @JsonProperty("city_name")
    public String getCityName() {
        return cityName;
    }

    @JsonProperty("city_name")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("wind_spd")
    public long getWindSpd() {
        return windSpd;
    }

    @JsonProperty("wind_spd")
    public void setWindSpd(long windSpd) {
        this.windSpd = windSpd;
    }

    @JsonProperty("last_ob_time")
    public String getLastObTime() {
        return lastObTime;
    }

    @JsonProperty("last_ob_time")
    public void setLastObTime(String lastObTime) {
        this.lastObTime = lastObTime;
    }

    @JsonProperty("wind_cdir_full")
    public String getWindCdirFull() {
        return windCdirFull;
    }

    @JsonProperty("wind_cdir_full")
    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    @JsonProperty("wind_cdir")
    public String getWindCdir() {
        return windCdir;
    }

    @JsonProperty("wind_cdir")
    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    @JsonProperty("slp")
    public long getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(long slp) {
        this.slp = slp;
    }

    @JsonProperty("vis")
    public long getVis() {
        return vis;
    }

    @JsonProperty("vis")
    public void setVis(long vis) {
        this.vis = vis;
    }

    @JsonProperty("h_angle")
    public double getHAngle() {
        return hAngle;
    }

    @JsonProperty("h_angle")
    public void setHAngle(double hAngle) {
        this.hAngle = hAngle;
    }

    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    @JsonProperty("dni")
    public double getDni() {
        return dni;
    }

    @JsonProperty("dni")
    public void setDni(double dni) {
        this.dni = dni;
    }

    @JsonProperty("dewpt")
    public long getDewpt() {
        return dewpt;
    }

    @JsonProperty("dewpt")
    public void setDewpt(long dewpt) {
        this.dewpt = dewpt;
    }

    @JsonProperty("snow")
    public long getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(long snow) {
        this.snow = snow;
    }

    @JsonProperty("uv")
    public double getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(double uv) {
        this.uv = uv;
    }

    @JsonProperty("precip")
    public long getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(long precip) {
        this.precip = precip;
    }

    @JsonProperty("wind_dir")
    public long getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(long windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("ghi")
    public double getGhi() {
        return ghi;
    }

    @JsonProperty("ghi")
    public void setGhi(double ghi) {
        this.ghi = ghi;
    }

    @JsonProperty("dhi")
    public double getDhi() {
        return dhi;
    }

    @JsonProperty("dhi")
    public void setDhi(double dhi) {
        this.dhi = dhi;
    }

    @JsonProperty("aqi")
    public long getAqi() {
        return aqi;
    }

    @JsonProperty("aqi")
    public void setAqi(long aqi) {
        this.aqi = aqi;
    }

    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(double lat) {
        this.lat = lat;
    }

    @JsonProperty("weather")
    public Weather getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("temp")
    public long getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(long temp) {
        this.temp = temp;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("elev_angle")
    public double getElevAngle() {
        return elevAngle;
    }

    @JsonProperty("elev_angle")
    public void setElevAngle(double elevAngle) {
        this.elevAngle = elevAngle;
    }

    @JsonProperty("app_temp")
    public double getAppTemp() {
        return appTemp;
    }

    @JsonProperty("app_temp")
    public void setAppTemp(double appTemp) {
        this.appTemp = appTemp;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}