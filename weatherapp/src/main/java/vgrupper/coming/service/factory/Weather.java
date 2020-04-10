package vgrupper.coming.service.factory;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public abstract class Weather {
    public abstract Map<String, Object> parseData(ResponseEntity<Object> response);
}
