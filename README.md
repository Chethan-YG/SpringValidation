# Spring Boot Validation Project

This project demonstrates a simple form submission using Spring Boot with validation using Jakarta Bean Validation. 
The form includes fields for username, email, password, and agreement to terms and conditions, with validation and error handling.

## Features

- User input validation with error messages
- Simple form submission with Thymeleaf
- Custom background and form styling with Bootstrap

## Technologies Used

- Spring Boot
- Thymeleaf
- Bootstrap 5.3.3

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.6.3 or later

### Installation

1. Clone the repository:
    git clone https://github.com/your-username/spring-boot-validation.git

2. Navigate to the project directory:
    cd spring-boot-validation

3. Install the dependencies and build the project:
    mvn clean install

### Running the Application

1. Start the Spring Boot application:
    mvn spring-boot:run  or right click and Run as  Spring Boot Application

2. Open a web browser and navigate to:
    http://localhost:8080/form

## Project Structure

spring-boot-validation
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── springboot
│   │   │           └── validation
│   │   │               ├── controller
│   │   │               │   └── MyController.java
│   │   │               └── entities
│   │   │                   └── LoginData.java
│   │   ├── resources
│   │   │   ├── static
│   │   │   │   └── images
│   │   │   │       └── background.jpg
│   │   │   ├── templates
│   │   │   │   ├── form.html
│   │   │   │   └── success.html
│   │   │   └── application.properties
│   └── test
│       └── java
│           └── com
│               └── springboot
│                   └── validation
│                       └── ValidationApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
