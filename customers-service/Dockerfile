FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/demo-0.0.1-SNAPSHOT.war customers.war
ENTRYPOINT ["java", "-jar", "/customers.war"]