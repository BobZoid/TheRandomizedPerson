FROM maven:3.6.3-openjdk-11-slim

COPY ./ ./

RUN mvn clean package

CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
