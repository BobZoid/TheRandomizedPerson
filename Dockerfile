FROM ubuntu:latest
EXPOSE 8080
CMD ["java", "-jar", "TheRandomizedPerson-1.0-SNAPSHOT.jar"]
COPY target/TheRandomizedPerson-1.0-SNAPSHOT.jar TheRandomizedPerson-1.0-SNAPSHOT.jar
