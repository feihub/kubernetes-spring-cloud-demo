FROM openjdk:8-alpine
COPY target/business-1.0-SNAPSHOT.jar /app.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar" ,"/app.jar"]
