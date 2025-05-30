FROM openjdk:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9988
ENTRYPOINT ["java", "-jar", "app.jar"]