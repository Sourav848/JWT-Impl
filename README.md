
JWT stands for JSON Web Token. It is a compact and self-contained way to securely transmit information between parties as a JSON object. JWTs are commonly used for authentication and authorization in web applications.

# Spring Boot JWT Authentication

This Spring Boot project implements JWT (JSON Web Token) authentication using Spring Security filters. It provides two APIs: one for user authentication and JWT generation (`/auth/login`), and another for accessing user details (`/home/users`).

## Features

- **JWT Authentication**: Uses JWT for authenticating users and securing APIs.
- **Spring Security Filters**: JWT authentication is implemented using Spring Security filters.
- **Two APIs**: Provides APIs for user authentication and accessing user details.

## Endpoints

- **`/auth/login`**
  - **Method**: POST
  - **Description**: Used for user authentication and JWT generation.
  - **Request Body**: 
    - Username
    - Password
  - **Response**: 
    - JWT token
  
- **`/home/users`**
  - **Method**: GET
  - **Description**: Retrieves user details.
  - **Authentication Required**: Yes
  - **Authorization**: Requires a valid JWT token in the request headers.

## Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Gradle

### Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/spring-boot-jwt-authentication.git

