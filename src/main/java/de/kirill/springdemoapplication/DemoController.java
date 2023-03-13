package de.kirill.springdemoapplication;

import de.kirill.springdemoapplication.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final BookService bookService;

    @GetMapping(path = "/demo/ping")
    ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }

    @GetMapping(path = "/demo/init")
    ResponseEntity<Void> initData() {
        bookService.initBooks();
        return ResponseEntity.ok().build();
    }

}
