
# Employee address:

CRUD operation on Job entity and add validation on entity class.
spring boot validation using annotations.

## Overview

This project, named "Employee address" is a robust Spring Boot application designed for managing user data efficiently. It provides  RESTful API endpoints that allow you to perform various operations like add,delete,get,update.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

@RestController
public class AddressController {


    @Autowired
    AddressService addressService;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;
## Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for user data. Additionally, it may include data mapping and conversion between Java objects and database entities.


##database
Mysql database
spring.datasource.url=jdbc:mysql://localhost:****/geekfs11
spring.datasource.username=root
spring.datasource.password=********
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

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



