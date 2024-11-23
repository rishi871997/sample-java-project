# Use OpenJDK 17 as base image
FROM openjdk:17-jre-slim

# Set working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/sample-java-project-1.0-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
