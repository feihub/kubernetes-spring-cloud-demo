FROM java:8
COPY target/maven-docker-image-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" ,"/app.jar"]
