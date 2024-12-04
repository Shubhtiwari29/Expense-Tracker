# Expense Tracker

An Expense Tracker application built with **Spring Boot**, **React**, and **MySQL** for managing personal finances. 
It allows users to track their income and expenses, categorize transactions, and visualize financial data through charts and reports.

## Features :->

- **User Authentication**:
  - Login and Registration using **JWT** (JSON Web Token).
  - User authentication via **Spring Security**.
  
- **Expense Management**:
  - Add, edit, and delete expenses.
  - Categorize expenses (e.g., Food, Travel, etc.).
  - Set recurring expenses.
  
- **Income Management**:
  - Add, edit, and delete income sources.
  
- **Data Visualization**:
  - Display expenses and income using **Charts.js**.
  - Pie and Bar charts to visualize the spending patterns and income.

- **Database Integration**:
  - Data stored in a **MySQL** database.
  - Support for both **Income** and **Expense** records.

- **Pagination**:
  - Paginated expense records and transactions.
  
- **Responsive Design**:
  - The front end is built using **React** and **Tailwind CSS**, making the app responsive across various screen sizes.

- **RESTful APIs**:
  - Exposed APIs for CRUD operations on expenses, income, and user management.
  
- **Docker Support**:
  - Dockerized application for easy deployment.
  
## Tech Stack :->

- **Backend**:
  - **Spring Boot** for backend development.
  - **Spring Security** for user authentication and authorization.
  - **JWT** for stateless authentication.
  - **MySQL** for data persistence.
  - **Spring Data JPA** for database interaction.
  
- **Frontend**:
  - **React** for the front-end user interface.
  - **Tailwind CSS** for styling.
  - **Chart.js** for visualizations (charts).

- **Docker**:
  - **Docker** for containerization.
  - **docker-compose** for multi-container setup (backend and MySQL).

## API Endpoints :->
- User Management
- POST /api/auth/register - Register a new user.
- POST /api/auth/login - Login and get a JWT token.

## Expense Management :->
- GET /api/expenses - Get all expenses.
- POST /api/expenses - Create a new expense.
- PUT /api/expenses/{id} - Update an existing expense.
- DELETE /api/expenses/{id} - Delete an expense.

## Income Management :->
- GET /api/income - Get all income records.
- POST /api/income - Add a new income source.
- PUT /api/income/{id} - Update an income source.
- DELETE /api/income/{id} - Delete an income source.

