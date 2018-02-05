# sample-spring-boot-multi-gradle-project-parent
Multi project gradle build using Spring Boot

To build:
cd sample-spring-boot-multi-gradle-project-parent
gradle clean bootRepackage

To run "sample-multi-gradle-project-data-service": 
cd sample-spring-boot-multi-gradle-project-parent/sample-multi-gradle-project-data-service/build/libs
java -jar sample-runner-0.0.1-SNAPSHOT.jar

To test: 
GET http://localhost:8080/sample/user?email=email!email.com

Response would be:

{
    "firstName": "First Name",
    "email": "email"
}
