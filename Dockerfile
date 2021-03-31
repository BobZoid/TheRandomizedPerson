FROM openjdk:11
WORKDIR /
ADD target/TheRandomizedPerson-1.0-SNAPSHOT.jar TheRandomizedPerson-1.0-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "TheRandomizedPerson-1.0-SNAPSHOT.jar"]
