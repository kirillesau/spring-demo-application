#FROM maven:3-openjdk-17-slim AS builder
#COPY . /build/.
#WORKDIR /build
#RUN mvn clean verify
#
#
#FROM openjdk:17-jdk-slim AS service
#EXPOSE 8080
#COPY --from=builder /build/target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM mvnd:0.6.0 as build
#
#COPY .mvn .mvn
#COPY mvnw .
#COPY pom.xml .
#COPY src src
#
#RUN /opt/mvnd/bin/mvnd -B package
#
#FROM openjdk:11-jre-slim-buster
#
#COPY --from=build target/*.jar app.jar
#
#EXPOSE 8080


FROM openjdk:17-slim-buster as build

COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw -B dependency:go-offline
COPY src src
RUN ./mvnw -B package

FROM openjdk:17-jdk-slim
COPY --from=build target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]