# Actuator

## pom.xml

To use the actuator you need the following dependency in your pom.xml:

```xml

<dependencys>
    ...
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>
    ...
</dependencys>
```

## Example

### Simple health-check

> Request:
>```shell
>curl localhost:8080/actuator/health
>```
>Response:
>```json
>{
>  "status": "UP"
>}
>```

### Further examples

Further examples can be found in
the [official documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html).