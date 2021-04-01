FROM jenkinsci/blueocean:latest
EXPOSE 8080
ADD target/TheRandomizedPerson-1.0-SNAPSHOT.jar TheRandomizedPerson-1.0-SNAPSHOT.jar
