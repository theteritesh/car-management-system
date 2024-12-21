# Car Management System 

This project is a **Car Management System** built with **Spring Boot**. It provides RESTful APIs for managing cars, including creating, retrieving, updating, and deleting car records.

## Features

- **CRUD Operations**: Create, Read, Update, and Delete car details.
- **Pagination and Sorting**: Browse cars with pageable results.
- **Global Search**: Search cars using a flexible API.
- **Validation**: Ensures proper data is submitted for all inputs.
- **Deployment**: Hosted on [Railway](https://railway.app).

## API Endpoints

Base URL: [https://car-management-system-production-3eb5.up.railway.app/](https://car-management-system-production-3eb5.up.railway.app/)
### Car Management

| Method | Endpoint         | Description                     | Request Body                                                                                       |
|--------|------------------|---------------------------------|---------------------------------------------------------------------------------------------------|
| GET    | `/api/cars`      | Retrieve a list of cars (supports pagination and sorting). | -                                                                                                 |
| GET    | `/api/cars/{id}` | Retrieve details of a specific car by ID. | -                                                                                                 |
| POST   | `/api/cars`      | Add a new car.                 | `{ "brand": "Toyota", "model": "Corolla", "year": 2020, "price": 15000 }`                        |
| PUT    | `/api/cars/{id}` | Update an existing car by ID.  | `{ "brand": "Toyota", "model": "Camry", "year": 2021, "price": 18000 }`                          |
| DELETE | `/api/cars/{id}` | Delete a car by ID.            | -                                                                                                 |

### Global Search

| Method | Endpoint             | Description               | Request Parameter                |
|--------|----------------------|---------------------------|-----------------------------------|
| GET    | `/api/cars/search`   | Search for cars globally. | `?query=search_term`             |

##  API Documentation
URL: [https://car-management-system-production-3eb5.up.railway.app/swagger-ui/index.html](https://car-management-system-production-3eb5.up.railway.app/swagger-ui/index.html)
## How to Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/theteritesh/car-management-system.git
   cd car-management-system

2. Set up the database:

- Install MySQL and create a database named car_management.
- Update the application.properties with your database credentials:
`spring.datasource.url=jdbc:mysql://localhost:3306/car_management`<br>
`spring.datasource.username=<your-username>`<br>
`spring.datasource.password=<your-password>`<br>

3.Build and run the application:
`mvn spring-boot:run`

4.Access the API locally at `http://localhost:8080`.
  
