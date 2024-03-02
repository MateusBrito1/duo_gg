FROM openjdk:17-jdk-alpine
RUN apk add --no-cache postgresql-client
WORKDIR /app
COPY target/duo_gg-0.0.1-SNAPSHOT.jar /app/duo_gg.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/duo_gg.jar"]
