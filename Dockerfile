
LABEL authors="viett"

FROM maven:latest

WORKDIR /app

COPY  POM.xml /app

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/timecalculator.jar"]