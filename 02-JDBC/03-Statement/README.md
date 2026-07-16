# Statement in JDBC

Statement is used to execute static SQL queries (queries without parameters) in a database.

---

## 🔑 What is Statement?

* Interface in JDBC
* Used to execute SQL queries
* Created using Connection object

---

## ⚙️ How it works

```java
Statement stmt = con.createStatement();
```

---

## 🔥 Methods of Statement

### 1. executeQuery()

* Used for SELECT queries
* Returns ResultSet

---

### 2. executeUpdate()

* Used for INSERT, UPDATE, DELETE
* Returns number of rows affected

---

### 3. execute()

* Used for any SQL query
* Returns boolean

---

## 💡 Example

```java
String query = "INSERT INTO student VALUES (1, 'Adesh')";
stmt.executeUpdate(query);
```

---

## 🔥 Limitations of Statement

* Not secure (SQL Injection risk)
* Slower (query compiled every time)
* Not reusable

---

## 🔥 Interview Questions

### 1. What is Statement?

Used to execute SQL queries.

---

### 2. Difference between executeQuery() and executeUpdate()?

| Method          | Use                  |
| --------------- | -------------------- |
| executeQuery()  | SELECT               |
| executeUpdate() | INSERT/UPDATE/DELETE |

---

### 3. Why Statement is not preferred?

Because of SQL injection and performance issues.

---

## ⚠️ Important Points

* Avoid using Statement in real applications
* Use PreparedStatement instead

---

## 🚀 Summary

Statement is used for executing simple SQL queries but is not recommended for real-world applications due to security and performance issues.
