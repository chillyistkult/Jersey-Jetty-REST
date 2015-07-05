# Jersey-Jetty-REST

A simple RESTful web service realized with Maven, Jersey and Jetty.

| Endpoint      | HTTP Method   | Response  |
| ------------- |:-------------:| -----:|
| /resources    | GET           | A list of available resources |
| /resources    | POST          | HTTP Status code |
| /resources/{id} | GET         | Content of the resource with the given id |
| /resources/{id} | DELETE      | HTTP Status code |

## Usage

Start the server

``mvn compile exec:java```

Check it works

```curl "http://localhost:8080/resources/1"```
Das ist ein eine UUID: [UUID]
