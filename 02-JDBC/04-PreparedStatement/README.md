# PreparedStatement in JDBC

PreparedStatement is used to execute parameterized SQL queries. It is more secure and efficient than Statement.

---

## 🔑 What is PreparedStatement?

* Precompiled SQL statement
* Uses placeholders (?)
* Prevents SQL Injection

---

## ⚙️ Syntax

```java
PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES (?, ?)");
```

---

## 🔥 Key Methods

* setInt(index, value)
* setString(index, value)
* executeQuery()
* executeUpdate()

---

## 🔥 Example

```java
ps.setInt(1, 1);
ps.setString(2, "Adesh");
ps.executeUpdate();
```

---

## 🔥 Advantages

* Prevents SQL Injection
* Faster (query compiled once)
* Reusable

---

## 🚨 SQL Injection (IMPORTANT)

### ❌ Using Statement (unsafe)

```java
String query = "SELECT * FROM student WHERE name = '" + userInput + "'";
```

👉 If input:

```sql
' OR '1'='1
```

👉 Query becomes:

```sql
SELECT * FROM student WHERE name = '' OR '1'='1'
```

👉 Returns ALL records ❌

---

### ✔ Using PreparedStatement (safe)

```java
String query = "SELECT * FROM student WHERE name = ?";
ps.setString(1, userInput);
```

👉 Input is treated as data, not SQL

---

## 🔥 Interview Questions

### 1. Difference between Statement and PreparedStatement?

| Statement     | PreparedStatement |
| ------------- | ----------------- |
| Not secure    | Secure            |
| Slower        | Faster            |
| Dynamic query | Parameterized     |

---

### 2. How PreparedStatement prevents SQL Injection?

By using placeholders (?) and treating input as data.

---

### 3. Why is it faster?

Query is precompiled.

---

## ⚠️ Important Points

* Always use PreparedStatement in real apps
* Avoid dynamic query concatenation
* Use correct data types

---

## 🚀 Summary

PreparedStatement is the preferred way to execute SQL queries in JDBC due to security and performance benefits.
