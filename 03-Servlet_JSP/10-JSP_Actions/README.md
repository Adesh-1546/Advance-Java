# JSP Action Tags

JSP Action Tags are used to perform dynamic actions at runtime, such as including resources, forwarding requests, and working with JavaBeans.

---

## 🔑 What are JSP Action Tags?

Tags that execute at runtime to control the flow between JSP pages.

---

## 🔥 Common Action Tags

### 1. jsp:include

```jsp
<jsp:include page="file.jsp" />
```

* Includes another resource at runtime
* Dynamic inclusion

---

### 2. jsp:forward

```jsp
<jsp:forward page="file.jsp" />
```

* Forwards request to another resource
* Stops current JSP execution

---

### 3. jsp:param

```jsp
<jsp:param name="key" value="value" />
```

* Pass parameters to included/forwarded page

---

### 4. jsp:useBean (Basic)

```jsp
<jsp:useBean id="obj" class="com.example.Bean" />
```

* Used to create or access JavaBean

---

## ⚖️ Include Directive vs Action Tag

| Include Directive | jsp:include |
| ----------------- | ----------- |
| Compile time      | Runtime     |
| Static            | Dynamic     |

---

## 🔥 Interview Questions

### 1. What are JSP action tags?

Tags that perform actions at runtime.

---

### 2. Difference between include directive and jsp:include?

Directive is compile-time, action is runtime.

---

### 3. What is jsp:forward?

Used to forward request to another resource.

---

## ⚠️ Important Points

* Action tags work at runtime
* Used for dynamic behavior
* Useful in modular JSP design

---

## 🚀 Summary

JSP Action Tags provide dynamic control over page flow and resource inclusion at runtime.
