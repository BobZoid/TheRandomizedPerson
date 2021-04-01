FROM openjdk:11-jre-slim
ADD target/TheRandomizedPerson-1.0-SNAPSHOT.jar /TheRandomizedPerson-1.0-SNAPSHOT.jar
CMD java -jar /TheRandomizedPerson-1.0-SNAPSHOT.jar
