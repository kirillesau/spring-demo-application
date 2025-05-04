# spring-demo-application

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![GitHub last commit](https://img.shields.io/github/last-commit/kirillesau/spring-demo-application)
[![Java CI with Maven](https://github.com/kirillesau/spring-demo-application/actions/workflows/build%20with%20maven.yml/badge.svg?branch=master)](https://github.com/kirillesau/spring-demo-application/actions/workflows/build%20with%20maven.yml)
[![Java CI with Maven](https://github.com/kirillesau/spring-demo-application/actions/workflows/build-with-self-hosted.yml/badge.svg?branch=master)](https://github.com/kirillesau/spring-demo-application/actions/workflows/build-with-self-hosted.yml)
[![Docker Image CI](https://github.com/kirillesau/spring-demo-application/actions/workflows/docker-image.yml/badge.svg?branch=master)](https://github.com/kirillesau/spring-demo-application/actions/workflows/docker-image.yml)

An example application with spring boot. It includes topics such
as [Docker build](Dockerfile), [GitHub Actions](.github/workflows),
[JPA](src/main/java/de/kirill/springdemoapplication/book/Book.java), [RESTController](src/main/java/de/kirill/springdemoapplication/DemoController.java),
and
more.

## Prerequisite

The example has been created for learning purposes only.

## How to run

### Maven

```shell
./mvnw package spring-boot:run
```

### Docker

```shell
docker build -t kirillesau/spring-demo-application .
docker run -p 8081:8080 -d --name spring-demo kirillesau/spring-demo-application
```

## Implementation help

- [RestController](docs/implementation/RestController.md)
- [JPA](docs/implementation/JPA.md)
- [Actuator](docs/implementation/Actuator.md)
- [GitHub Actions](docs/implementation/GitHubActions.md)
- [Dockerfile](docs/implementation/Dockerfile.md)
