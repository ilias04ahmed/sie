FROM openjdk:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9955
ENTRYPOINT ["java", "-jar", "app.jar"]