# Hibernate Entity (Student)

An entity class represents a table in the database. Hibernate maps this Java class to a database table using annotations.

---

## 🔑 What is an Entity?

* A Java class mapped to a database table
* Each object represents a row

---

## 🔥 Annotations Used

### @Entity

Marks the class as a Hibernate entity

---

### @Table

```java
@Table(name = "student")
```

Specifies table name

---

### @Id

Marks primary key

---

### @GeneratedValue

```java
@GeneratedValue(strategy = GenerationType.IDENTITY)
```

Auto-generates ID

---

### @Column

```java
@Column(name = "name", nullable = false)
```

Maps field to column

---

## 🔄 Mapping Example

| Java Field | Database Column |
| ---------- | --------------- |
| id         | id              |
| name       | name            |
| age        | age             |

---

## 🔥 Important Rules

* Must have default constructor
* Must have @Id
* Use getters/setters

---

## 🔥 Interview Questions

### 1. What is an entity class?

A class mapped to a database table.

---

### 2. Why default constructor?

Required by Hibernate to create objects.

---

### 3. What is @GeneratedValue?

Automatically generates primary key.

---

## ⚠️ Important Points

* Entity represents table
* Object represents row
* Annotations define mapping

---

## 🚀 Summary

Entity class is the core of Hibernate ORM, enabling object-to-table mapping.
