# Blog REST API

## Project Overview
This is a **Blog REST API** built with **Spring Boot** that provides endpoints for managing blogs, users, and comments. It allows users to create, update, delete, and retrieve blog posts along with authentication and authorization features.

## Features
- User authentication and authorization (JWT-based security)
- CRUD operations for blog posts
- Commenting system for blog posts
- User profile management
- Pagination and sorting support
- RESTful API design with proper status codes

## Technologies Used
- Java
- Spring Boot
- Spring Security & JWT
- Hibernate & JPA
- MySQL Database
- Maven

## Installation and Setup

### Prerequisites
- Java 17 or later
- Maven
- MySQL Server

### Steps to Run the Application
1. Clone the repository:
   ```sh
   git clone <repository-url>
   cd blog-rest-api
   ```
2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/blog_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Build and run the application:
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```
4. API will be available at:
   ```
   http://localhost:8080/api
   ```

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /api/auth/register | Register a new user |
| POST | /api/auth/login | Authenticate user |
| GET | /api/posts | Get all blog posts |
| GET | /api/posts/{id} | Get a specific blog post |
| POST | /api/posts | Create a new blog post |
| PUT | /api/posts/{id} | Update a blog post |
| DELETE | /api/posts/{id} | Delete a blog post |
| POST | /api/posts/{id}/comments | Add a comment to a post |

## Contribution Guidelines
1. Fork the repository
2. Create a new branch
3. Make your changes
4. Submit a pull request


---

**Happy Coding!** 🚀

