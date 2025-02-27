#FROM openjdk:21

FROM maven:latest
LABEL authors="viett"


WORKDIR /app

COPY  pom.xml /app

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/timecalculator.jar"]