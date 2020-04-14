package vgrupper.coming.integrations;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
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
import vgrupper.coming.entity.WeatherEntity;
import vgrupper.coming.repository.WeatherRepository;

@Service
public class WeatherService  {

	@Autowired
	WeatherRepository weatherRepository;

	private static final String WEATHER_URL =
			"http://api.openweathermap.org/data/2.5/weather?q={city},{country}&APPID={key}";

	private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);

	private final RestTemplate restTemplate;

	private final String apiKey = "f75e4c6be1ccc40ca1dde7ce8c24d911";


	public WeatherService(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@Cacheable("weather")
	public Weather getWeather(String country, String city) throws ParseException {
		logger.info("Requesting current weather for {}/{}", country, city);
		URI url = new UriTemplate(WEATHER_URL).expand(city, country, this.apiKey);
		return invoke(url, Weather.class);
	}

	private <T> T invoke(URI url, Class<T> responseType) throws ParseException {
		RequestEntity<?> request = RequestEntity.get(url).accept(MediaType.APPLICATION_JSON).build();
		ResponseEntity<T> exchange = this.restTemplate.exchange(request, responseType);
		JSONObject obj = new JSONObject(exchange.getBody());
		double temperature = obj.getDouble("temperature");
		int id = obj.getInt("weatherId");
		String name = obj.getString("name");
		String timestamp = obj.getString("timestamp");
		//Cоздаю entity
		WeatherEntity weatherEntity = new WeatherEntity();
		weatherEntity.setCity(name);
		weatherEntity.setTemperature(temperature);
		//2020-04-14T22:42:11Z "hh:mm a, EEE MM/dd/yyyy"
		Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(timestamp);
		Instant reqInstant = date.toInstant();
		weatherEntity.setTimestamp(reqInstant);
		//Save
		weatherRepository.save(weatherEntity);

		return exchange.getBody();

	}

}
