# spring-demo-application

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![GitHub last commit](https://img.shields.io/github/last-commit/kirillesau/spring-demo-application)
[![Java CI with Maven](https://github.com/kirillesau/spring-demo-application/actions/workflows/build%20with%20maven.yml/badge.svg?branch=master)](https://github.com/kirillesau/spring-demo-application/actions/workflows/build%20with%20maven.yml)
[![Docker Image CI](https://github.com/kirillesau/spring-demo-application/actions/workflows/docker-image.yml/badge.svg?branch=master)](https://github.com/kirillesau/spring-demo-application/actions/workflows/docker-image.yml)

An example application with spring boot

## How to run

### Maven

```shell
./mvnw package spring-boot:run
```

### Docker

```shell
docker build --platform linux/amd64 -t kirillesau/spring-demo-application .
docker run -p 8081:8080 --platform linux/x86_64/v8 -d --name spring-demo kirillesau/spring-demo-application
```