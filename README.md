# Spring Boot CRUD API with MongoDB

This repository contains a simple CRUD (Create, Read, Update, Delete) API built with **Spring Boot** and **MongoDB**. The API can be consumed by any frontend framework like **React**, **Vue.js**, or **Angular** to create full-stack applications.

## Features

- **Create**: Add new records to the MongoDB database.
- **Read**: Retrieve existing records from MongoDB.
- **Update**: Modify existing records in MongoDB.
- **Delete**: Remove records from MongoDB.

## Technologies Used

- **Spring Boot**: Backend framework for building the RESTful API.
- **Spring Data MongoDB**: For MongoDB database interactions.
- **MongoDB**: NoSQL database to store data.
- **REST API**: Provides endpoints for CRUD operations.

## Prerequisites

Before setting up the project, make sure you have the following installed:

- **Java 8 or higher**
- **Maven** (for managing project dependencies)
- **MongoDB** (either locally or use a cloud service like MongoDB Atlas)
- **IDE**: Eclipse, IntelliJ IDEA, or any Java IDE of your choice

## Getting Started

### Clone the Repository

To clone this repository to your local machine, run the following command:

```bash
git clone https://github.com/your-username/spring-boot-crud-api.git
cd spring-boot-crud-api
```

### Build the Application
Once you've cloned the repository, you can build the project using Maven. Run the following command in the project directory:
```bash
mvn clean install
```
### Run the Application
After building the project, run the application using:
```bash
mvn spring-boot:run
```
### MongoDB Configuration
Example MongoDB configuration for local MongoDB instance:
```bash
spring.data.mongodb.uri=mongodb://localhost:27017/your-database-name
```
###  API Endpoints
The backend exposes the following endpoints for CRUD operations:

- GET /api/items - Fetch all items.
- GET /api/items/{id} - Fetch a single item by ID.
- POST /api/items - Create a new item.
- PUT /api/items/{id} - Update an existing item.
- DELETE /api/items/{id} - Delete an item by ID.
