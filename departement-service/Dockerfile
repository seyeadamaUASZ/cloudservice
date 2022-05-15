FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} departement-service.jar
ENTRYPOINT ["java","-jar","/departement-service.jar"]
EXPOSE 9001
