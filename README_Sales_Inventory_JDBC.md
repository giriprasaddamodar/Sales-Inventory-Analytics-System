
# Sales & Inventory Tracker (Java + JDBC + OOP + MySQL)

## 📘 Project Overview

This beginner-level project demonstrates how to track inventory using:
- ✅ Java (with Object-Oriented Programming)
- ✅ JDBC (Java Database Connectivity)
- ✅ MySQL (Database)
- ✅ (Optional) Power BI for visualization

The application creates a `Product` object and stores its data directly into a MySQL table using JDBC.

---

## 🧱 Technologies Used

- Java
- JDBC (with MySQL Connector/J)
- MySQL Server
- (Optional) Power BI Desktop

---

## 🗃️ Database Setup (Run in MySQL)

```sql
CREATE DATABASE IF NOT EXISTS inventory_db;
USE inventory_db;

CREATE TABLE IF NOT EXISTS products (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    quantity INT,
    price DECIMAL(10,2)
);
```

---

## 💻 Java Code Highlights

- `Product` class with `id`, `name`, `quantity`, `price`
- Uses `PreparedStatement` to insert data into MySQL
- Demonstrates basic **OOP** and **JDBC** principles

---

## 🚀 How to Run

1. Install MySQL and create the `inventory_db` using the SQL script.
2. Download [MySQL JDBC Driver (Connector/J)](https://dev.mysql.com/downloads/connector/j/)
3. Add the `.jar` file to your Java project classpath.
4. Replace `your_password` in the code with your MySQL root password.
5. Compile and run:

```bash
javac InventoryJDBC.java
java InventoryJDBC
```

---

## 🧠 Interview Q&A

### Q: What is this project?
A simple inventory tracker that uses Java objects and JDBC to insert product data into a MySQL database.

### Q: What OOP concepts did you use?
- Class & Object
- Constructor
- Method
- Encapsulation

### Q: What is JDBC?
JDBC stands for Java Database Connectivity. It's an API that lets Java communicate with databases like MySQL.

### Q: Why use JDBC?
To automate inserting data into a database instead of writing SQL manually.

### Q: What does `PreparedStatement` do?
It safely inserts dynamic data into the database using parameters `?`.

---

## 📊 Optional Power BI Use

You can connect Power BI to `inventory_db` to visualize:
- Total stock
- Product-wise quantity
- Total revenue

---

## ✅ Author
Giri Prasaath – B.E. ECE  
Basic Java | SQL | Power BI | Beginner IoT | TCS Ninja Interview Preparation
