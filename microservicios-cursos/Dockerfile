FROM openjdk:17-jdk-alpine
RUN addgroup -S microservicios-cursos
USER admin:microservicios-cursos
VOLUME /tmp
ARG JAR_FILE=TARGET/*.jar
ADD target/${JAR_FILE} app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]