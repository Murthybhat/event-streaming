# Use JRE11 slim
FROM openjdk:11.0-jre-slim

# Add the app jar
ADD target/*.jar webnotification.jar

ENTRYPOINT java -jar webnotification.jar