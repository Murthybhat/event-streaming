# Use JRE11 slim
FROM openjdk:11.0-jre-slim

# Add the app jar
ADD target/*.jar event-producer.jar

ENTRYPOINT java -jar event-producer.jar