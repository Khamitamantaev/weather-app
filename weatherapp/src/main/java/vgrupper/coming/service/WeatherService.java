package vgrupper.coming.service;

import java.net.URI;
import java.text.ParseException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;
import vgrupper.coming.integrations.Weatherwb;
import vgrupper.coming.integrations.worldweather.Data;
import vgrupper.coming.integrations.worldweather.Example;
import vgrupper.coming.repository.WeatherRepository;

@Service
public class WeatherService  {

	@Autowired
	WeatherRepository weatherRepository;

	private static final String WEATHER_URL =
			"http://api.openweathermap.org/data/2.5/weather?q={city}&appid={key}";
	private static final String WEATHER_URL_WB =
			"https://api.weatherbit.io/v2.0/current?city={city},&key={key}";
	private static final String WEATHER_URL_WorldWeather =
			"http://api.worldweatheronline.com/premium/v1/weather.ashx?key={key}&q={city}&format=json&num_of_days=1";
	private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

	private final RestTemplate restTemplate;
//ключи сюда нужно добавить
	private final String apiKey = "f75e4c6be1ccc40ca1dde7ce8c24d911";
	private final String apiKeyWB = "";
	private final String apiKeyWW = "";

	public WeatherService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@Cacheable("weatherOWM")
	public Example getWeatherOWM(String city) throws ParseException {
		logger.info("Requesting current weather for {}/{}",city);
		URI url = new UriTemplate(WEATHER_URL).expand(city,this.apiKey);
		return invokeFromOpenWM(url, Example.class);
	}

	private <T> T invokeFromOpenWM(URI url, Class<T> responseType) throws ParseException {
		String weatherappi = "OpenWeatherMap";
		RequestEntity<?> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<T> exchange = this.restTemplate.exchange(request, responseType);
		JSONObject obj = new JSONObject(exchange.getBody());

		//weatherRepository.save(weatherEntity);

		return exchange.getBody();
	}






		//		double temperature = obj.getDouble("temperature");
//		String name = obj.getString("name");
//		String timestamp = obj.getString("timestamp");
//		//Cоздаю entity
//		WeatherEntity weatherEntity = new WeatherEntity();
//		weatherEntity.setCity(name);
//		weatherEntity.setTemperature(temperature);
//		weatherEntity.setWeatherappi(weatherappi);
//		//2020-04-14T22:42:11Z "hh:mm a, EEE MM/dd/yyyy"
//		Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(timestamp);
//		Instant reqInstant = date.toInstant();
//		weatherEntity.setTimestamp(reqInstant);
		//Save


	@Cacheable("weatherWB")
	public Weatherwb getWeatherWB(String city) throws ParseException {
		logger.info("Requesting current weather for {}/{}", city);
		URI url = new UriTemplate(WEATHER_URL_WB).expand(city, this.apiKeyWB);
		return invokeFromWB(url, Weatherwb.class);
	}

	private <T> T invokeFromWB(URI url, Class<T> responseType) throws ParseException {
		String weatherappi = "weatherbit.io";
		RequestEntity<?> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<T> exchange = this.restTemplate.exchange(request, responseType);
		JSONObject obj = new JSONObject(exchange.getBody());
		//db save logic

		return exchange.getBody();
	}
	@Cacheable("weatherWW")
	public Data getWeatherWorldWeather(String city) throws ParseException {
		logger.info("Requesting current weather for {}/{}", city);
		URI url = new UriTemplate(WEATHER_URL_WorldWeather).expand(apiKeyWW, city);
		return invokeFromWW(url, Data.class);
	}
	private <T> T invokeFromWW(URI url, Class<T> responseType) throws ParseException {
		String weatherappi = "weatherbit.io";
		RequestEntity<?> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<T> exchange = this.restTemplate.exchange(request, responseType);
		JSONObject obj = new JSONObject(exchange.getBody());

		//db save logic
		 return exchange.getBody();
}}
