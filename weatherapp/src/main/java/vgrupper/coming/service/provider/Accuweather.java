package vgrupper.coming.service.provider;

import org.springframework.http.ResponseEntity;
import vgrupper.coming.service.factory.Weather;

import java.util.HashMap;
import java.util.Map;

public class Accuweather extends Weather {
    @Override
    public Map<String, Object> parseData(ResponseEntity<Object> response) {
        Map<String, Object> json = new HashMap<String, Object>();
        json.put("accuweather", response.getBody());
        return json;
    }
}
