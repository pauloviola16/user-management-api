FROM eclipse-temurin:21
LABEL maintainer="pcviola.dev@gmail.com"
WORKDIR /aplicacao
COPY target/user-management-api-0.0.1-SNAPSHOT.jar user-management-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "user-management-api.jar"]