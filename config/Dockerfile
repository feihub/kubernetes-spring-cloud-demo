FROM openjdk:8-alpine
COPY target/config-1.0-SNAPSHOT.jar /app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar" ,"/app.jar"]
