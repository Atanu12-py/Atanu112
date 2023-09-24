
# Job Search Portal:

CRUD operation on Job entity and add validation on entity class.
spring boot validation using annotations.

## Overview

This project, named "Job Search Portal" is a robust Spring Boot application designed for managing user data efficiently. It provides  RESTful API endpoints that allow you to perform various operations like add,delete,get,update.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

@RestController
public class JobController {
    @Autowired
    JobService jobService;


@PostMapping("Jobs")
@GetMapping("Jobs")
@DeleteMapping("Jobs/id/{id}")
@GetMapping("Jobs/type/{type}/salary/{salary}")
@GetMapping("Jobs/location/{location}")
@GetMapping("Jobs/type/{type}")
@PutMapping("Jobs/id/{id}/salary/{salary}")

## Services

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

@Service
public class JobService {
    @Autowired
    JobRepo iJobRepo;

## Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for user data. Additionally, it may include data mapping and conversion between Java objects and database entities.


##database
H2 database
spring.datasource.url=jdbc:h2:mem:h2db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=ina728mg
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

spring.h2.console.enabled=true
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true


## Data Structures Used
NA

#UI Used
Swagger

Swagger in Spring Boot is an open-source project that helps generate documents of REST APIs for RESTful web services via a web browser. It renders the documentation of an API visually using web services. Open API is the specification, and Swagger is a tool that helps implement the API specification

## Project Summary

The Job Search Portal project is a robust Spring Boot application designed for efficient data management. It offers a set of RESTful API endpoints.



