FROM openjdk:8-alpine
COPY target/oauth2-1.0-SNAPSHOT.jar /app.jar
EXPOSE 8016
ENTRYPOINT ["java","-jar" ,"/app.jar"]
