# Use Amazon Corretto JDK version 21 as the base image
FROM amazoncorretto:21

# Copy the JAR file from the local build/libs directory to the root of the Docker image
# Adjust the path according to the location of your JAR file
COPY build/libs/app.jar app.jar

# Set the command to run the JAR file when the container starts
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
