# spring-boot-hello-world

A simple example to demonstrate a Hello World applicaton using Spring Boot that runs locally and on Cloud Foundry

## Building

Requires
* Java 1.8
* Maven

```
mvn clean package
```

## Runing locally

```
mvn spring-boot:run
```

To view the applicaiton, open a browser and navigate to http://localhost:8080

## Running on Cloud Foundry 

```
cf push hello-world -p target/hello-world-0.0.1-SNAPSHOT.jar
```

To view the application, open a browser and navigate to the URL specified after pushing the application. This should look something like hello-world.sys.example.com
