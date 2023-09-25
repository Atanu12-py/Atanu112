
# Project Title

A brief description of what this project

## Overview

This project, named "User Management," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of RESTful API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

### Controller

The Controller layer is responsible for handling incoming HTTP requests and delegating them to the appropriate services. It defines API endpoints for the following operations:

@PostMapping("user")
@GetMapping("alluser")
@GetMapping("user/{id}")
@PutMapping("userup/{id}/number/{num}")
@DeleteMapping("user/{id}")

## Services

The Services layer implements the core business logic, data processing, and interaction with the data repository. Key responsibilities include:

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

## Repository

The Repository layer manages data access to the underlying database. It handles database operations such as Create, Read, Update, and Delete (CRUD) for user data. Additionally, it may include data mapping and conversion between Java objects and database entities.

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;
    public List<User> getUsers(){
        return userList;
    }
}

##database

**Integer userId;
**String name;
**String userName;
**String address;
**String contactNo;

## Data Structures Used

The project utilizes the following data structures:

#ArrayList

The project utilizes the `ArrayList` data structure to store and manage lists of `User` objects in various parts of the application. `ArrayList` provides dynamic sizing and efficient element retrieval, making it suitable for storing user records and performing operations on them.

## Project Summary

The User Management project is a robust Spring Boot application designed for efficient user data management. It offers a set of RESTful API endpoints for various user-related operations, including adding, retrieving, updating, and deleting user information.



