FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/demo-0.0.1-SNAPSHOT.war employees.war
ENTRYPOINT ["java", "-jar", "/employees.war"]