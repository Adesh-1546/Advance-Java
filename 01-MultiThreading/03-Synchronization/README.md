# Synchronization in Java

Synchronization is used to control access to shared resources by multiple threads to prevent data inconsistency.

---

## 🔥 Race Condition

A race condition occurs when multiple threads access and modify shared data at the same time, leading to incorrect results.

---

## 🔒 What is Synchronization?

Synchronization ensures that only one thread can access a critical section at a time.

---

## 🔑 Types of Synchronization

### 1. Synchronized Method

```java
public synchronized void increment() {
    count++;
}
```

---

### 2. Synchronized Block

```java
synchronized(this) {
    count++;
}
```

---

## ⚖️ Method vs Block

| Method              | Block               |
| ------------------- | ------------------- |
| Locks entire method | Locks specific code |
| Simple              | More efficient      |

---

## 🔥 Example

Without synchronization → incorrect result
With synchronization → correct result

---

## 🔥 Interview Questions

### 1. What is synchronization?

Controlling thread access to shared resources.

---

### 2. What is race condition?

Multiple threads modifying shared data leading to wrong results.

---

### 3. Difference between synchronized method and block?

Method locks whole method, block locks only part.

---

### 4. What is intrinsic lock?

Every object has a lock used in synchronization.

---

## ⚠️ Important Points

* Only one thread can enter synchronized block at a time
* Improves data consistency
* May reduce performance due to locking

---

## 🚀 Summary

Synchronization prevents race conditions by allowing only one thread to access shared resources at a time.
