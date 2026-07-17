# Transaction in JDBC

A transaction is a group of SQL operations executed as a single unit of work.

---

## 🔑 Why Transaction?

* Ensures data consistency
* Prevents partial updates
* Used in critical operations (banking, payments)

---

## ⚙️ Steps in Transaction

1. Disable auto-commit
2. Execute queries
3. Commit if successful
4. Rollback if error occurs

---

## 🔥 Example

```java
con.setAutoCommit(false);

con.commit();   // save changes
con.rollback(); // undo changes
```

---

## 🔥 ACID Properties

### 1. Atomicity

All operations succeed or none

---

### 2. Consistency

Database remains valid

---

### 3. Isolation

Transactions do not interfere

---

### 4. Durability

Changes are permanent

---

## 🔥 Interview Questions

### 1. What is transaction?

Group of SQL operations executed together.

---

### 2. What is commit()?

Saves changes permanently.

---

### 3. What is rollback()?

Reverts changes if error occurs.

---

### 4. What is auto-commit?

Default mode where each query is committed automatically.

---

## ⚠️ Important Points

* Always disable auto-commit for transactions
* Use rollback on failure
* Important for financial systems

---

## 🚀 Summary

Transactions ensure reliable execution of multiple database operations with consistency and safety.
