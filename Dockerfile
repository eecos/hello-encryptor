FROM docker.io/java:8-jre

MAINTAINER hi.jerry@outlook.com

ENV TZ=Asia/Shanghai
ENV JAVA_OPTS="-Xms512m -Xmx1024m -Djava.security.egd=file:/dev/./urandom"

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /encryptor-boot

WORKDIR /encryptor-boot

EXPOSE 8081

ADD ./target/encryptor-boot.jar ./

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]