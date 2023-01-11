FROM openjdk:17
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/microservicios-usuarios-0.0.1-SNAPSHOT.jar /app/microservicios-usuarios-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/microservicios-usuarios-0.0.1-SNAPSHOT.jar"]