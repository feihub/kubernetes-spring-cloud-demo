FROM openjdk:8-alpine
COPY target/zipkin-1.0-SNAPSHOT.jar /app.jar
EXPOSE 8012
ENTRYPOINT ["java","-jar" ,"/app.jar"]
