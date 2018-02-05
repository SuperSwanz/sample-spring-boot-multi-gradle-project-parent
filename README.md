# sample-spring-boot-multi-gradle-project-parent
Multi project gradle build using Spring Boot

To build: <br/>
cd sample-spring-boot-multi-gradle-project-parent <br/>
gradle clean bootRepackage
<br/><br/><br/>
To run "sample-multi-gradle-project-data-service": <br/>
cd sample-spring-boot-multi-gradle-project-parent/sample-multi-gradle-project-data-service/build/libs <br/>
java -jar sample-runner-0.0.1-SNAPSHOT.jar
<br/><br/><br/>
To test: <br/>
GET http://localhost:8080/sample/user?email=email!email.com
<br/>
Response would be: <br/>
```
{
    "firstName": "First Name",
    "email": "email"
}
```
