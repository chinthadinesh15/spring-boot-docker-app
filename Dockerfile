FROM openjdk:11
MAINTAINER "Dinesh Babu <chinthadineshbabu15@gmail.com>"
COPY target/spring-boot-docker-app.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-docker-app.jar"]
