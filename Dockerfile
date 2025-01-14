# Use a base image with JDK
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
