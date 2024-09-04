# Spring-Boot-RESTful-API-for-Product-Management

Project Description: Spring Boot RESTful API for Product Management
This project is a Spring Boot-based RESTful web application designed for managing products in an inventory system. It provides a set of CRUD (Create, Read, Update, Delete) operations that allow users to interact with product data stored in a relational database.

Key Features:
RESTful API: The application exposes RESTful endpoints that handle HTTP requests for managing products. It supports the following operations:

Create: Add a new product to the inventory.
Read: Retrieve details of all products or a specific product by its ID.
Update: Modify the details of an existing product.
Delete: Remove a product from the inventory by its ID.
Spring Data JPA: Utilized for seamless interaction with the database, providing a layer of abstraction over the Java Persistence API (JPA). The ProductRepo interface extends JpaRepository, enabling CRUD operations on the Product entity without the need for boilerplate code.

Entity Management: The Product class is an entity annotated with @Entity, representing the data structure of the product in the database. Each product has attributes such as prodId, prodName, and price.

Dependency Injection: The project leverages Spring's dependency injection mechanism, enabling loose coupling and easy testing. Services like ProductService are automatically wired into the controllers using @Autowired.

MVC Architecture: The project follows the Model-View-Controller (MVC) pattern, where the ProductController handles HTTP requests and responses, the Product model represents the data, and the ProductService provides business logic.

Database Integration: The application can be easily connected to various relational databases (like H2, MySQL, or PostgreSQL) for persistent storage of product data.

Error Handling: The application handles scenarios where a product might not be found by returning default values or appropriate HTTP status codes.

Use Case:
This project is ideal for anyone looking to understand or implement a basic product management system with a RESTful API using Spring Boot. It can serve as the foundation for more complex applications, such as e-commerce platforms or inventory management systems.

How It Works:
Endpoints:

GET /products: Fetch all products.
GET /products/{prodId}: Fetch a product by its ID.
POST /products: Add a new product.
PUT /products: Update an existing product.
DELETE /products/{prodId}: Delete a product by its ID.
Database Interaction: The ProductRepo interface interacts with the database to perform CRUD operations, and ProductService manages the business logic.

This project exemplifies the power and simplicity of Spring Boot for building scalable and maintainable web applications.
