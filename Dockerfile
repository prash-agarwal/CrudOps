# Use the official OpenJDK image as the base image
# Here we are using the DockerFile inside the Project
# To create the docker image, we will have to use the path inside the project
# For example path here will be : /C:\Users\DELL\eclipse-workspace\crudops
FROM openjdk

# Set the working directory inside the container
WORKDIR /usr/src/myapp

# Copy the current directory contents into the container at /usr/src/myapp/
COPY . /usr/src/myapp/

# Set the default command to run when the container starts
CMD ["java","-jar","crudops-0.0.1-SNAPSHOT.jar"]

# Inform Docker that the container listens on port 8081
EXPOSE 8081
