FROM openjdk:17
COPY target/AILineBot.jar AILineBot.jar
CMD ["--server.port=8080"]
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "AILineBot.jar"]
