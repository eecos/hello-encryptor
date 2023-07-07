FROM openjdk:8-jre-alpine

ENV JAVA_OPTS="-Xms100m -Xmx100m -Djava.security.egd=file:/dev/./urandom"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

RUN addgroup -S spring \
    && adduser -S spring -G spring \
    && ln -sf /usr /share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
    && touch /app.jar

USER spring:spring

EXPOSE 8081

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]