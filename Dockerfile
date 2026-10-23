FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/Java-CI-Docker-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-cp", "app.jar", "com.example.Java_CI_Docker.App"]
