package vgrupper.coming.service.factory;

import vgrupper.coming.service.provider.Accuweather;
import vgrupper.coming.service.provider.Openweathermap;
import vgrupper.coming.service.provider.Weatherbit;

public class WeatherFactory {
    public static Weather getWeatherDataParser(WeatherApiTypes model) {
        Weather weather = null;
        switch (model) {
            case OPENWEATHERMAP:
                weather = new Openweathermap();
                break;

            case  ACCUWEATHER:
                weather = new Accuweather();
                break;

            case WEATHERBIT:
                weather = new Weatherbit();
                break;

            default:
                break;
        }
        return weather;
    }
}