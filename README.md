# Task Tracker REST API

A backend application built with **Spring Boot** and **MongoDB** for managing daily tasks.

## 🚀 Features
- Create, view, update, and delete tasks
- Track task status (Pending, Completed)
- Input validation using Jakarta Validation
- Global exception handling for clean error responses

## 🧱 Tech Stack
- Java 17  
- Spring Boot 3.x  
- MongoDB  
- Maven

## 🧠 How to Run
1. Clone the repository  
   `git clone https://github.com/AyushChandekar27/task-tracker-api.git`
2. Open in IntelliJ or VS Code  
3. Run the app:  
   `mvn spring-boot:run`
4. Access API at  
   `http://localhost:8080/tasks`

## 📩 Example Request
**POST /tasks**

```json
{
  "title": "Finish Spring Boot project",
  "description": "Complete REST API by today",
  "status": "PENDING"
}
