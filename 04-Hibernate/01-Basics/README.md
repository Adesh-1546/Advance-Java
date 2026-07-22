# Hibernate Basics

Hibernate is an ORM (Object Relational Mapping) framework that simplifies database interaction by mapping Java objects to database tables.

---

## 🔑 What is ORM?

ORM maps:

* Java Class → Database Table
* Object → Row
* Fields → Columns

---

## 🔄 Hibernate vs JDBC

| JDBC        | Hibernate            |
| ----------- | -------------------- |
| Manual SQL  | No need to write SQL |
| More code   | Less code            |
| Error-prone | Easier to manage     |
| Table-based | Object-based         |

---

## 🔥 Why Hibernate?

* Reduces boilerplate code
* Handles SQL internally
* Improves productivity
* Database-independent

---

## 🔑 Core Components

* Configuration
* SessionFactory
* Session
* Transaction

---

## 🔄 Workflow

1. Configure Hibernate
2. Create SessionFactory
3. Open Session
4. Perform CRUD
5. Close Session

---

## 🔥 Example (Concept)

```java
Session session = factory.openSession();
Transaction tx = session.beginTransaction();

session.save(student);

tx.commit();
session.close();
```

---

## 🔥 Interview Questions

### 1. What is Hibernate?

ORM framework to map Java objects with database tables.

---

### 2. What is ORM?

Mapping objects to relational database tables.

---

### 3. Hibernate vs JDBC?

Hibernate reduces code and avoids manual SQL.

---

## ⚠️ Important Points

* Hibernate works on objects, not tables
* Requires configuration file
* Uses session for DB operations

---

## 🚀 Summary

Hibernate simplifies database operations by converting Java objects into database records automatically.
