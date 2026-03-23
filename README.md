# 🎓 Spring Boot Student CRUD API

## 📌 Project Description
This project is a Spring Boot REST API that performs basic CRUD operations for managing student data.

The API allows users to:
- ➕ Add a new student
- 📄 View all students
- 🔍 View a student by ID
- ✏️ Update student details
- ❌ Delete a student

---

## 🛠 Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Eclipse IDE
- REST API
- Postman

---

## 📁 Project Structure

redt_api
│
├── controller
│ └── StudentController.java
│
├── model
│ └── Student.java
│
├── repository
│ └── StudentRepository.java
│
├── service
│ └── StudentService.java
│
├── RedtApiApplication.java
└── application.properties

---

## ⚙️ Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

---

## 🔗 API Endpoints

### 1️⃣ Get All Students
GET /api/students


### 2️⃣ Get Student by ID

GET /api/students/{id}


### 3️⃣ Add Student

POST /api/students


#### Example Request JSON
```json
{
  "id": 1,
  "name": "Sakshi",
  "course": "CSE"
}
4️⃣ Update Student
PUT /api/students/{id}
Example Request JSON
{
  "name": "Sakshi Kumari",
  "course": "AI & ML"
}
```
5️⃣ Delete Student
DELETE /api/students/{id}
▶️ Running the Project
Clone the repository:
git clone https://github.com/sakshii-1707/rest_api.git
Open the project in Eclipse IDE
Run:
RedtApiApplication.java
Test using Postman:
http://localhost:8080/api/students
📷 API Testing (Postman)
➤ Add Student
<img width="869" height="692" alt="image" src="https://github.com/user-attachments/assets/b77f3abe-36dc-4165-ac17-5a792c64cc17" />
➤ Get All Students
<img width="854" height="673" alt="image" src="https://github.com/user-attachments/assets/bdae7837-3d08-49e3-baa6-65f6cc313e8f" />
➤ Get Student by ID
<img width="868" height="760" alt="image" src="https://github.com/user-attachments/assets/6bece7cc-7011-43c1-ae72-8359ef3e9706" />
➤ Update Student
<img width="910" height="798" alt="image" src="https://github.com/user-attachments/assets/276d9be7-9b0b-4825-b398-c384523069ca" />
➤ Delete Student
<img width="845" height="617" alt="image" src="https://github.com/user-attachments/assets/0f136487-9770-4b99-9997-d418499f49d8" />

<img width="869" height="692" alt="image" src="https://github.com/user-attachments/assets/b77f3abe-36dc-4165-ac17-5a792c64cc17" />
<img width="854" height="673" alt="image" src="https://github.com/user-attachments/assets/bdae7837-3d08-49e3-baa6-65f6cc313e8f" />
<img width="868" height="760" alt="image" src="https://github.com/user-attachments/assets/6bece7cc-7011-43c1-ae72-8359ef3e9706" />
<img width="910" height="798" alt="image" src="https://github.com/user-attachments/assets/276d9be7-9b0b-4825-b398-c384523069ca" />
<img width="880" height="686" alt="image" src="https://github.com/user-attachments/assets/07c884b8-909a-42b0-a704-e1ee75fa17a2" />
<img width="845" height="617" alt="image" src="https://github.com/user-attachments/assets/0f136487-9770-4b99-9997-d418499f49d8" />
