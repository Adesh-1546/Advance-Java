# ResultSet in JDBC

ResultSet is used to retrieve data from a database after executing a SELECT query.

---

## 🔑 What is ResultSet?

* Object returned by executeQuery()
* Contains data retrieved from database
* Works like a cursor

---

## ⚙️ How it works

```java
ResultSet rs = ps.executeQuery();
```

---

## 🔄 Iterating ResultSet

```java
while(rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
}
```

---

## 🔥 Common Methods

* next() → move to next row
* getInt(column)
* getString(column)
* getDouble(column)

---

## 🧠 Cursor Behavior

* Before first row → initial position
* next() → moves forward
* No backward movement (default)

---

## 🔥 Interview Questions

### 1. What is ResultSet?

Used to store and retrieve data from database.

---

### 2. What does next() do?

Moves cursor to next row.

---

### 3. What happens if no data?

Loop will not execute.

---

### 4. Can we move backward?

No (by default forward-only)

---

## ⚠️ Important Points

* Always use next() before accessing data
* Use correct column names or index
* Close ResultSet after use

---

## 🚀 Summary

ResultSet is used to process data retrieved from database row by row using cursor-based navigation.
