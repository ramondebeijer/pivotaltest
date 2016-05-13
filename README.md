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

## Running on Cloud Foundry 

```
cf push hello-world -p target/hello-world-0.0.1-SNAPSHOT.jar
```
