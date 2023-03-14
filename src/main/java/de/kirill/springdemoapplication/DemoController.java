package de.kirill.springdemoapplication;

import de.kirill.springdemoapplication.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final BookService bookService;
    private final Environment environment;

    @GetMapping(path = "/demo/ping")
    ResponseEntity<String> ping() throws UnknownHostException {
        return ResponseEntity.ok("pong from Host: " + InetAddress.getLocalHost().getHostName() + " and Port: " + environment.getProperty("local.server.port"));
    }

    @GetMapping(path = "/demo/init")
    ResponseEntity<Void> initData() {
        bookService.initBooks();
        return ResponseEntity.ok().build();
    }

}
