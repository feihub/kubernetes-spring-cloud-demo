FROM openjdk:8-alpine
COPY target/zuul-1.0-SNAPSHOT.jar /app.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar" ,"/app.jar"]
