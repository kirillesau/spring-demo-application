# JPA

## pom.xml

To use JPA you need the following dependency in your pom.xml:

```xml

<dependencys>
    ...
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    ...
</dependencys>
```

## Example implementation

### Entity

```java
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    // more fields/columns
}
```

### Repository

```java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExampleRepository extends JpaRepository<Example, UUID> {
}
```

The ExampleRepository can be used in the following way:

```java

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    Example getExampleForId(UUID id) {
        return exampleRepository.findById(id).orElse(null);
    }

    List<Example> getExamples() {
        return exampleRepository.findAll();
    }
}
```

