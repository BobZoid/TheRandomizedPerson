FROM openjdk:11-jre-slim
ADD target/TheRandomizedPerson-2.0.jar /TheRandomizedPerson-2.0.jar
CMD java -jar /TheRandomizedPerson-2.0.jar

