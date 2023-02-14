FROM openjdk:17
# EXPOSE 8080
ADD target/AILineBot.jar AILineBot.jar
ENTRYPOINT ["java", "-jar", "AILineBot.jar"]
