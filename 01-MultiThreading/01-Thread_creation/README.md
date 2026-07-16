# Thread Creation in Java

Multithreading allows multiple threads to run concurrently, improving performance and responsiveness.

---

## 🔑 Ways to Create Thread

### 1. Extending Thread Class

```java
class MyThread extends Thread {
    public void run() {
        // task
    }
}
```

---

### 2. Implementing Runnable Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        // task
    }
}
```

---

### 3. Using Lambda Expression

```java
Runnable task = () -> {
    // task
};
```

---

## ⚖️ Thread vs Runnable

| Thread                    | Runnable               |
| ------------------------- | ---------------------- |
| Uses inheritance          | Uses interface         |
| Less flexible             | More flexible          |
| Cannot extend other class | Can extend other class |

---

## 🔥 start() vs run()

| Method  | Description        |
| ------- | ------------------ |
| start() | Creates new thread |
| run()   | Normal method call |

---

## 🔥 Interview Questions

### 1. How to create a thread?

By extending Thread or implementing Runnable.

---

### 2. Which is better?

Runnable (more flexible).

---

### 3. Difference between start() and run()?

start() creates new thread, run() does not.

---

## ⚠️ Important Points

* Always use start() to begin thread
* Runnable is preferred approach
* Threads run concurrently

---

## 🚀 Summary

Threads can be created using Thread class or Runnable interface. Runnable is preferred due to flexibility and better design.
