FROM openjdk:17-alpine
ARG JAR_FILE
COPY ${JAR_FILE} /app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar
EXPOSE 8080