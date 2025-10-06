FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/VacationApp-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} vacationApp.jar
ENTRYPOINT [ "java", "-jar", "/vacationApp.jar" ]