FROM maven:3.6.3-openjdk-11-slim

COPY ./ ./

RUN mvn clean package

CMD ["java", "-jar", "target/TheRandomizedPerson-1.0-SNAPSHOT.jar"]
