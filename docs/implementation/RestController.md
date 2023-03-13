# RestController

## pom.xml

To implement a rest controller you need the following dependency in your pom.xml:

```xml

<dependencys>
    ...
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ...
</dependencys>
```

## Example implementation

A sample implementation for a simple RestController is shown below.

```java
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping(path = "/demo/ping")
    ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }
}
```

The endpoint can be addressed with the following curl command:

```shell
curl localhost:8080/demo/ping
```

## Examples in this repository

- [DemoController](../../src/main/java/de/kirill/springdemoapplication/DemoController.java)
- [BookController](../../src/main/java/de/kirill/springdemoapplication/book/BookController.java)