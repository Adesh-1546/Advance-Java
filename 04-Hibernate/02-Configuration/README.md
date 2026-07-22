# Hibernate Configuration

Hibernate configuration is used to set up database connection and mapping between Java classes and database tables.

---

## 🔑 What is hibernate.cfg.xml?

* Main configuration file
* Contains database details
* Defines Hibernate properties

---

## 🔥 Key Properties

### Database Connection

* driver_class → JDBC driver
* url → database URL
* username/password → credentials

---

### Hibernate Settings

* dialect → database type
* show_sql → display SQL queries
* hbm2ddl.auto → schema management

---

## 🔥 hbm2ddl.auto Options

| Value    | Meaning                  |
| -------- | ------------------------ |
| create   | Creates table every time |
| update   | Updates table            |
| validate | Validates schema         |
| none     | No action                |

---

## 🔥 Mapping

```xml
<mapping class="Hibernate.Student"/>
```

Maps Java class to table.

---

## ⚠️ Important Points

* Must match database configuration
* Mapping class is required
* Dialect depends on DB

---

## 🚀 Summary

hibernate.cfg.xml is used to configure database connection and Hibernate behavior.
