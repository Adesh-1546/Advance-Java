# ServletConfig vs ServletContext

ServletConfig and ServletContext are used to pass configuration data to servlets.

---

## 🔑 ServletConfig

* Used for single servlet
* Initialized when servlet is created
* Defined inside servlet tag

---

## 🔑 ServletContext

* Used for entire application
* Shared by all servlets
* Defined globally

---

## ⚖️ Difference

| ServletConfig        | ServletContext             |
| -------------------- | -------------------------- |
| Per servlet          | Global                     |
| Not shared           | Shared                     |
| Defined in <servlet> | Defined in <context-param> |

---

## 🔥 Example

```java
config.getInitParameter("message");
context.getInitParameter("appName");
```

---

## 🔥 Interview Questions

### 1. What is ServletConfig?

Configuration specific to one servlet.

---

### 2. What is ServletContext?

Global configuration shared across application.

---

### 3. Key difference?

Scope → local vs global.

---

## ⚠️ Important Points

* ServletConfig is not shared
* ServletContext is shared
* Both defined in web.xml

---

## 🚀 Summary

ServletConfig provides servlet-level configuration, while ServletContext provides application-level shared configuration.
