# Servlets & JSP Basics

Servlets and JSP are server-side technologies used to build dynamic web applications in Java.

---

## 🔑 What is a Servlet?

* A Java class that handles HTTP requests and responses
* Runs on a web server (Tomcat)
* Used to process client requests

---

## 🔑 What is JSP?

* Java Server Pages
* Used to create dynamic web pages
* Converts into servlet internally

---

## 🔄 Servlet Lifecycle

1. init() → called once when servlet is created
2. service() → handles requests (doGet/doPost)
3. destroy() → called before servlet is destroyed

---

## 🔄 JSP Lifecycle

1. JSP is converted to Servlet
2. Compiled into class
3. Loaded and executed

---

## ⚖️ Servlet vs JSP

| Servlet          | JSP               |
| ---------------- | ----------------- |
| Java code        | HTML + Java       |
| Logic handling   | UI (presentation) |
| Hard to write UI | Easy to design UI |

---

## 🔥 Why use Servlets & JSP?

* Build dynamic web applications
* Handle client-server communication
* Foundation for frameworks like Spring

---

## 🔥 Interview Questions

### 1. What is a Servlet?

A server-side Java class that handles HTTP requests.

---

### 2. What is JSP?

A technology used to create dynamic web pages.

---

### 3. Lifecycle of Servlet?

init → service → destroy

---

### 4. Difference between Servlet and JSP?

Servlet → logic, JSP → UI

---

## ⚠️ Important Points

* Servlet handles business logic
* JSP is used for presentation
* JSP is internally converted to Servlet

---

## 🚀 Summary

Servlets handle request processing while JSP is used to generate dynamic web pages, together forming the basis of Java web development.
