FROM openjdk:11-jre-slim
ADD target/TheRandomizedPerson-2.0.jar /2.0-SNAPSHOT.jar
CMD java -jar /TheRandomizedPerson-2.0.jar

