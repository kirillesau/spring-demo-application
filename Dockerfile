FROM maven:3-eclipse-temurin-17-alpine as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN --mount=type=cache,target=/root/.m2 mvn -f $HOME/pom.xml clean package -Dmaven.test.skip

FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /usr/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]