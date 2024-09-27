package com.example.crudops;

public class Docker {

	//Here we have mentioned all the frequently used Docker Commands.
//	
//	Docker Commands : 
//
//		wsl --install 
//		It is used to install wsl in local system
//
//		docker -v 
//		It is used to check the version of docker that is installed in our system.
//
//		docker login
//		Gives prompt to enter the Username and pwd to login.  
//		Docker username - prashagarwal21    , pwd - Jerry@2024
//
//		docker run hello-world
//		Checks that if there is a image named hello-world present locally in the system. 
//		If it's not there, then it will download it and runs that image.
//		This command is used to create and start a new container from a specified image.
//
//		docker images
//		Commands to check the images we have present locally.
//
//		docker rmi bootimage
//		Command to remove a image
//
//		docker pull hello-world
//		Checks that if there is a image named hello-world present locally in the system. 
//		If it's not there, then it will downloads it. It wont run that image.
//
//		docker pull openjdk:18
//		Checks that if there is a image named hello-world present locally in the system. 
//		If it's not there, then it will download it of particular version present in docker hub.
//		https://hub.docker.com/_/openjdk
//
//		docker search mysql
//		Used to search any image in docker hub. After 'search' we can specify the name of the image that we want to search.
//
//		docker ps
//		Used to check currently running container created by running an Image.
//
//		docker ps -a
//		To check all the containers that got created by running the image in the past.
//
//		docker run --name JavaOpenJdk 71260f256d19
//		Used to run a image where we can provide a custom name to the container by passing 
//		the image id. 71260f256d19 is the Image Id
//
//		docker run -d -it --name java1openjdk 71260f256d19
//		used to run in interactive mode and -d is used to run in detach mode
//		If we dont run the image using detach mode, then container will run on cmd and cmd 
//		will get tied to that container and we wont be able to
//		work on the cmd anymore for using docker commands.
//
//		Once we have created Container using above commands, we can check that what are 
//		the conatiners that got created and are running.
//		docker ps
//
//		C:\Users\DELL>docker ps
//		CONTAINER ID   IMAGE          COMMAND    CREATED          STATUS          PORTS     NAMES
//		dd6f37d6af51   71260f256d19   "jshell"   27 seconds ago   Up 16 seconds             javajdk
//
//		To access the conatiner created above, we will have to use the Command 'jshell' 
//		mentioned above in description of Container - 'javajdk'
//
//		docker exec -it dd6f37d6af51 jshell
//		We can use this command to execut and use the container created by specifying the conatiner 
//		 
//		jshell> /history 
//		To check history inside jshell
//
//		jshell> /exit
//		|  Goodbye
//
//		docker inspect dd6f37d6af51
//		Inspect the details of container
//
//		docker restart containerName
//		Used to restart the container
//
//		docker logs containerName
//		Used to check logs of the container.
//
//		docker volume
//
//		docker logout
//
//		docker run --name bootContainer -p 8081:8081 -it -d bootimage
//		Command used to run image on specified port
//		-p HostPort:ContainerPort -> Maps internal docker port 
//							(Container port) to a port on the host (host port)
//
//		docker run --name bootContainer -p 8080:8081 -it -d bootimage
//		We can run the image on different host port also other than the Conatiner port.
//		This way we can run the multiple instances of the same container on multiple port.
//
//
//		docker build -t bootimage .
//		Command used to create custom Image using Dockerfile and our project.
//		Here the command is run where the project and Dockerfile are present. 
//		Dockerfile does'nt have any extension.
//		Dockerfile is used to create a image and it runs particular project(jar here)
//
//		docker container ls
//		Used to list all the conatiners.
//
//		docker container
//		Gives all the commands that we can use with conatiner
	
//Other commands from Udemy Spring Boot Course
//	docker container run -d -p 5000:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
//	docker container run -d -p 5000:5000 in28min/hello-world-java:0.0.1.RELEASE
//	docker container run -d -p 5000:5000 in28min/hello-world-python:0.0.1.RELEASE
//	docker container ls 
//	docker image ls
//	docker container stop cc
//	docker container run -d -p 5001:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
//	docker container run -d -p 5002:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
//	docker container run -p 5003:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
//	docker container run -p 5003:5000 in28min/hello-world-nodejs:0.0.1.RELEASE
//	 
//	docker --version
//	docker container ls
//	docker build -t in28min/hello-world-docker:v1 .
//	docker image list
//	docker run -d -p 5000:5000 in28min/hello-world-docker:v1
//	docker build -t in28min/hello-world-docker:v2 .
//	docker container run -d -p 5000:5000 in28min/hello-world-docker:v2
//	docker build -t in28min/hello-world-docker:v3 .
//	docker container run -d -p 5000:5000 in28min/hello-world-docker:v3
//	docker build -t in28min/hello-world-docker:v4 .
	
	
}
