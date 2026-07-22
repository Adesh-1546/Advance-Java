# Servlet Communication (Forward vs Redirect)

Servlet communication allows one resource to communicate with another using forwarding or redirection.

---

## 🔑 RequestDispatcher (Forward)

* Server-side operation
* Same request is used
* URL does NOT change

---

## 🔑 sendRedirect()

* Client-side operation
* New request is created
* URL changes

---

## ⚖️ Difference

| Forward       | Redirect        |
| ------------- | --------------- |
| Server-side   | Client-side     |
| Same request  | New request     |
| Fast          | Slightly slower |
| URL unchanged | URL changes     |

---

## 🔥 Example

### Forward

```java id="x6r5c1"
request.getRequestDispatcher("page.jsp").forward(request, response);
```

---

### Redirect

```java id="srmc3o"
response.sendRedirect("page.jsp");
```

---

## 🔥 Interview Questions

### 1. Difference between forward and redirect?

Forward uses same request, redirect creates new request.

---

### 2. Which is faster?

Forward (no new request)

---

### 3. Can we pass data?

Forward → request attribute
Redirect → URL parameters

---

## ⚠️ Important Points

* Forward keeps request data
* Redirect does not keep request data
* Use redirect after form submission

---

## 🚀 Summary

Forward and redirect are used for navigation between resources, with forward being server-side and redirect being client-side.
