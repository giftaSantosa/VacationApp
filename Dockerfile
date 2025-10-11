#Building base image
FROM eclipse-temurin:21-jdk AS base
WORKDIR /app

#Install dependencies
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
COPY mvnw.cmd .
RUN chmod +x mvnw

RUN ./mvnw dependency:go-offline

#Copy in the source code
COPY src ./src
EXPOSE 8080

CMD [ "./mvnw", "spring-boot:run"]