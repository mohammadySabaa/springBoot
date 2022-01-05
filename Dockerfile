FROM openjdk:8-jre-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sonar-1.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","/sonar-1.jar"]