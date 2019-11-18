FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"
VOLUME /tmp

EXPOSE 8081

ARG JAR_FILE=build/libs/kafka-server-0.1.jar
ADD ${JAR_FILE} kafka-server.jar
ENTRYPOINT ["java","-jar","/kafka-server.jar"]
