# Library Management System

## Overview
The Library Management System is a Java-based application that allows users to borrow, return, and search for books. It provides different user roles (Admin, Librarian, Member) with specific permissions to manage the library's catalog effectively. The system tracks book availability and flags overdue books.

## Features
- User roles with different permissions:
  - **Admin**: Add, remove, and update books in the catalog.
  - **Librarian**: Manage book loans and returns.
  - **Member**: Search for books and view borrowed books.
- Book management:
  - Borrow and return books.
  - Search for books by title, author, or ISBN.
  - Track book availability and overdue status.

## Project Structure
```
library-management-system
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── library
│   │   │           ├── App.java
│   │   │           ├── models
│   │   │           │   ├── Book.java
│   │   │           │   ├── User.java
│   │   │           │   └── Role.java
│   │   │           ├── services
│   │   │           │   ├── BookService.java
│   │   │           │   ├── UserService.java
│   │   │           │   └── AuthService.java
│   │   │           └── controllers
│   │   │               ├── AdminController.java
│   │   │               ├── LibrarianController.java
│   │   │               └── MemberController.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── library
│                   └── AppTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd library-management-system
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn exec:java -Dexec.mainClass="com.library.App"
   ```

## Usage
- Admins can log in to manage the catalog.
- Librarians can handle book loans and returns.
- Members can search for books and manage their borrowed items.

## Technologies Used
- Java
- Maven
- Spring Framework (if applicable)
- JUnit (for testing)

## License
This project is licensed under the MIT License. See the LICENSE file for details.