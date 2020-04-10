package vgrupper.coming.service.provider;

import org.springframework.http.ResponseEntity;
import vgrupper.coming.service.factory.Weather;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Weatherbit extends Weather {
    @Override
    public Map<String, Object> parseData(ResponseEntity<Object> response) {
        Map<String, Object> json = new HashMap<String, Object>();
        List<LinkedHashMap<String, Object>> getList = ((List<LinkedHashMap<String, Object>>) ((LinkedHashMap<String, LinkedHashMap<String, LinkedHashMap>>) response
                .getBody()).get("data"));
        json.put("weatherbit", getList);
        return json;
    }
}
