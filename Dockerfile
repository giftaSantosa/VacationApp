FROM eclipse-temurin:21-jdk
WORKDIR /VacationApp

COPY target/VacationApp-0.0.1-SNAPSHOT.jar /vacationApp.jar

ENTRYPOINT [ "java", "-jar", "/vacationApp.jar" ]