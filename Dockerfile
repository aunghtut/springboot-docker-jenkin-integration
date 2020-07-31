FROM openjdk:8
EXPOSE 8080
ADD target/springboot-docker-jenkin-integration.jar springboot-docker-jenkin-integration.jar
ENTRYPOINT ["java","-jar","springboot-docker-jenkin-integration.jar"]
