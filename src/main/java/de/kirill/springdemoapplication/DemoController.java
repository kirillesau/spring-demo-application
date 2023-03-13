package de.kirill.springdemoapplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/ping")
    ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}
