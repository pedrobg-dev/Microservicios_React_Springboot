FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/demo-0.0.1-SNAPSHOT.war suppliers.war
ENTRYPOINT ["java", "-jar", "/suppliers.war"]