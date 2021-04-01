FROM payara/server-web:5.2021.1-jdk11
EXPOSE 8080
CMD ["java", "-jar", "TheRandomizedPerson-1.0-SNAPSHOT.jar"]
COPY target/TheRandomizedPerson-1.0-SNAPSHOT.jar $DEPLOY_DIR
