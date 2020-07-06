FROM openjdk:8
ADD target/spring-boot-hello-jar.jar spring-boot-hello-jar.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring-boot-hello-jar.jar"]