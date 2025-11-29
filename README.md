
# 📦 Spring Boot Product API

A clean and scalable Product Management REST API built using Spring Boot, Spring Data JPA, and PostgreSQL.
Follows a clear Clean Architecture approach with Controller → Service → DTO → Entity → Repository.

## 🚀 Features
  - Create, Read, Update, Delete (CRUD) products
  - Layered clean architecture
  - Uses DTOs for clean request/response
  - PostgreSQL database integration
  - JPA & Hibernate support
  - Global exception handling (optional)
  - Easy to extend with new features
  - Modern folder structure for enterprise-level projects

```
📁Project Structure
src/
 └── main/
     ├── java/com/example/productapi
     │    ├── controller
     │    ├── service
     │    ├── repository
     │    ├── dto
     │    └── entity
     └── resources
          ├── application.properties

```
## 🛠️ Tech Stack

  - Java 17+
  - Spring Boot
  - Spring Data JPA
  - Hibernate
  - PostgreSQL
  - Lombok

```
🧩 Entity: Product
@Id
@GeneratedValue(strategy = GenerationType.UUID)
private String id;

private String name;
private String description;
private String category;
private String brand;

private float price;
private int quantity;

private boolean available;

private LocalDateTime createdAt;
private LocalDateTime updatedAt;
```
## 📦 API Endpoints
#### Method	Endpoint	Description
GET	/api/products	Get all products
GET	/api/product/{id}	Get product by ID
POST	/api/product	Create new product
PUT	/api/product/{id}	Update existing product
DELETE	/api/product/{id}	Delete product by ID
📝 Sample JSON (POST / PUT)
{
  "name": "Laptop",
  "description": "15-inch display, 16GB RAM",
  "category": "Electronics",
  "brand": "Dell",
  "price": 55000,
  "quantity": 10,
  "available": true
}






![productapi](https://github.com/user-attachments/assets/0b84ae69-992b-4557-a79e-81b41f99f2e1)
