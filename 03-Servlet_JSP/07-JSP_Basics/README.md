# JSP Basics

JSP (Java Server Pages) is a technology used to create dynamic web pages using HTML and Java.

---

## 🔑 What is JSP?

* Server-side technology
* Used to generate dynamic content
* Internally converted into a Servlet

---

## 🔄 JSP Lifecycle

1. JSP → Servlet (translation)
2. Compilation
3. Execution

---

## 🔑 JSP Elements

### 1. Scriptlet

```jsp
<% Java code %>
```

Used to write Java logic

---

### 2. Expression

```jsp
<%= value %>
```

Used to display output

---

### 3. Directive

```jsp
<%@ page ... %>
```

Used to configure JSP

---

## 🔥 Example

```jsp
<%
    String name = "Adesh";
%>

<p><%= name %></p>
```

---

## 🔥 Interview Questions

### 1. What is JSP?

Used to create dynamic web pages.

---

### 2. How JSP works?

Converted into servlet internally.

---

### 3. Difference between JSP and Servlet?

| JSP         | Servlet   |
| ----------- | --------- |
| Easy UI     | Java code |
| HTML + Java | Only Java |

---

## ⚠️ Important Points

* Avoid heavy Java code in JSP
* Use JSP mainly for UI
* JSP is compiled into servlet

---

## 🚀 Summary

JSP simplifies the creation of dynamic web pages by combining HTML and Java code.
