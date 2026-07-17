# CallableStatement in JDBC

CallableStatement is used to execute stored procedures or functions in a database.

---

## 🔑 What is CallableStatement?

* Used to call stored procedures/functions
* Supports IN, OUT, and INOUT parameters
* Improves performance and reusability

---

## ⚙️ Syntax

```java
CallableStatement cs = con.prepareCall("{ call procedure_name(?) }");
```

---

## 🔥 Types of Parameters

* IN → input value
* OUT → return value
* INOUT → both input and output

---

## 🔥 Example

```java
cs.registerOutParameter(1, Types.VARCHAR);
cs.setInt(2, 1);
cs.execute();
```

---

## 🔥 Advantages

* Reusable database logic
* Better performance
* Cleaner code

---

## 🔥 Interview Questions

### 1. What is CallableStatement?

Used to call stored procedures.

---

### 2. Difference between PreparedStatement and CallableStatement?

| PreparedStatement    | CallableStatement          |
| -------------------- | -------------------------- |
| Executes SQL queries | Calls stored procedures    |
| Uses ? placeholders  | Uses procedure call syntax |

---

### 3. What are IN and OUT parameters?

IN → input, OUT → output from DB

---

## ⚠️ Important Points

* Requires stored procedure/function
* Must register OUT parameters
* Syntax differs for databases

---

## 🚀 Summary

CallableStatement is used to execute stored procedures, enabling reusable and efficient database operations.
