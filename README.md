# 🏨 Hotel Booking Platform

A full-stack hotel booking application developed to streamline the process of **searching**, **booking**, and **managing** hotel accommodations. This project showcases proficiency in modern web development technologies and best practices.

---

## 📌 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Environment Variables](#environment-variables)
- [Screenshots](#screenshots)
- [Demo](#demo)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

---

## ✅ Features

### 👤 User Functionality

- **Hotel Browsing**: Search and filter hotels by location, price, and amenities.
- **Room Booking**: Real-time availability checks and booking capabilities.
- **User Authentication**: Secure login and registration.
- **Profile Management**: Manage bookings and personal details.

### 🛠️ Admin Functionality

- **Dashboard**: Overview of bookings, users, and hotel listings.
- **Hotel Management**: Add, update, or delete hotel listings.
- **User Management**: Monitor and manage user accounts.

---

## 🛠️ Tech Stack

### 🎨 Frontend
- **Framework**: React.js
- **Styling**: CSS3
- **Build Tool**: Vite

### 🧰 Backend
- **Language**: Java
- **Framework**: Spring Boot
- **Database**: MySQL
- **ORM**: Hibernate

### ⚙️ Tools & Libraries
- **Version Control**: Git
- **API Testing**: Postman
- **Authentication**: Spring Security
- **Others**: Maven, ESLint

---

## 🚀 Getting Started

### ✅ Prerequisites

- Node.js (v14+)
- Java JDK (v11+)
- MySQL (v5.7+)
- Maven

### 📦 Installation

#### Frontend

```bash
cd frontend/lakeSide-hotel-demo-client-main
npm install
npm run dev

Backend

bash
Copy
Edit
cd backend
Edit application.properties with your DB credentials:

properties

Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
Then run:

bash
Copy
Edit
mvn spring-boot:run
➡ Backend runs at: http://localhost:8080

🔐 Environment Variables
Backend (application.properties)
properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

📸 Screenshots
Replace below with actual images or links

Home Page
## 🏠 Home Page

Hotel Listing

Booking Page

Admin Dashboard

🎬 Demo
Add live link or video recording

Live Demo

🗂️ Project Structure
css
Copy
Edit
Hotel-booking-site/
├── backend/
│   ├── src/
│   ├── pom.xml
│   └── application.properties
├── frontend/
│   ├── lakeSide-hotel-demo-client-main/
│   │   ├── src/
│   │   ├── public/
│   │   ├── package.json
│   │   └── vite.config.js
├── README.md
└── .gitignore
🤝 Contributing
Fork the repo.

Create a new branch:

bash
Copy
Edit
git checkout -b feature/YourFeature
Commit your changes:

bash
Copy
Edit
git commit -m "Add YourFeature"
Push to GitHub:

bash
Copy
Edit
git push origin feature/YourFeature
Open a Pull Request.

