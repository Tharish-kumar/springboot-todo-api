# 📝 Spring Boot Todo API

A robust RESTful API for managing Todo tasks, built with Java and Spring Boot. This project demonstrates full CRUD operations (Create, Read, Update, Delete) connected to a MySQL database.

## 🚀 Tech Stack
* **Language:** Java
* **Framework:** Spring Boot 3
* **Database:** MySQL
* **ORM:** Spring Data JPA (Hibernate)
* **Tools:** Lombok, Postman, Maven

## 🌟 Key Features
* **Create Todos:** Add new tasks with unique titles.
* **Read Data:** Fetch all tasks or find a specific task by ID.
* **Safe Update:** Updates existing tasks without creating duplicates (safeguards ID).
* **Delete:** Remove completed tasks from the database.
* **Error Handling:** Returns proper HTTP status codes (e.g., 404 Not Found).

## 🔌 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **POST** | `/Api/V5/Todo/create` | Create a new Todo item |
| **GET** | `/Api/V5/Todo/all` | Get all Todo items |
| **GET** | `/Api/V5/Todo/find?id={id}` | Get a specific Todo by ID |
| **PUT** | `/Api/V5/Todo/update/{id}` | Update an existing Todo |
| **DELETE** | `/Api/V5/Todo/delete/{id}` | Delete a Todo item |

## 🛠️ How to Run
1.  Clone the repository.
2.  Configure your MySQL database in `application.properties`.
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/tododb
    spring.datasource.username=root
    spring.datasource.password=your_password
    ```
3.  Run the application using your IDE or `mvn spring-boot:run`.

## 🔮 Future Improvements
* Adding Pagination for large lists.
* Implementing Validation (e.g., cannot create Todo with empty title).
