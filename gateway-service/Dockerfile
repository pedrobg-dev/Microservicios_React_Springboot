FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/awesome-app-api-gateway-1.0.0-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar", "/gateway.jar"]