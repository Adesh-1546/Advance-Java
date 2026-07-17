# JDBC (Java Database Connectivity)

This module demonstrates how Java applications interact with relational databases using JDBC. It covers core concepts, practical examples, and interview-focused implementations using PostgreSQL.

---

## 📚 Topics Covered

### 1. Basics

* JDBC architecture
* Types of drivers (Type 1–4)
* Steps to connect to database

---

### 2. Connection

* Establishing connection using DriverManager
* PostgreSQL JDBC URL
* Exception handling

---

### 3. Statement

* Executing static SQL queries
* executeQuery(), executeUpdate(), execute()
* Limitations of Statement

---

### 4. PreparedStatement ⭐ (Most Important)

* Parameterized queries
* Prevents SQL Injection
* Better performance

---

### 5. ResultSet

* Fetching data from database
* Cursor-based navigation
* Data retrieval methods

---

### 6. Transaction ⭐

* setAutoCommit(false)
* commit() and rollback()
* ACID properties

---

### 7. Batch Processing

* Executing multiple queries together
* Performance optimization

---

### 8. CallableStatement

* Calling stored functions
* IN and OUT parameters

---

### 9. Connection Pooling (HikariCP)

* Efficient connection management
* Improved performance

---

### 10. CRUD Operations ⭐

* Create, Read, Update, Delete
* Implemented using PreparedStatement
* Separate classes for clean structure

---

## 🗄️ Database Setup

All database scripts are provided in the `database/` folder:

* `schema.sql` → Creates tables
* `data.sql` → Inserts sample data
* `functions.sql` → Creates stored functions

---

### ▶️ Run Setup (PostgreSQL)

```bash
psql -U postgres -d testdb -f schema.sql
psql -U postgres -d testdb -f data.sql
psql -U postgres -d testdb -f functions.sql
```

---

## 🔑 Key JDBC Steps

1. Load Driver
2. Establish Connection
3. Create Statement / PreparedStatement
4. Execute Query
5. Process ResultSet
6. Close Resources

---

## 🔥 Important Concepts

* PreparedStatement prevents SQL Injection
* Transactions ensure data consistency
* ResultSet is cursor-based
* Connection pooling improves performance

---

## 🔥 Interview Questions

### 1. What is JDBC?

API used to connect Java with database.

---

### 2. Difference between Statement and PreparedStatement?

| Statement     | PreparedStatement |
| ------------- | ----------------- |
| Not secure    | Secure            |
| Slower        | Faster            |
| Dynamic query | Parameterized     |

---

### 3. What is ResultSet?

Used to fetch data from database.

---

### 4. What is transaction?

Group of SQL operations executed as a single unit.

---

### 5. What is connection pooling?

Reusing database connections to improve performance.

---

## ⚠️ Best Practices

* Always use PreparedStatement
* Close all resources
* Use transactions for critical operations
* Avoid hardcoding credentials in production

---

## 🚀 Purpose

* Strengthen JDBC fundamentals
* Build backend development skills
* Prepare for technical interviews

---

## 📌 Conclusion

This module provides a complete understanding of JDBC from basics to advanced concepts with practical implementations, making it suitable for interview preparation and real-world backend development.

