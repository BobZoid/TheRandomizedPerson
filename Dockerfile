FROM openjdk:8
EXPOSE 8080
ADD target/TheRandomizedPerson-1.0-SNAPSHOT.jar TheRandomizedPerson-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "TheRandomizedPerson-1.0-SNAPSHOT.jar"]