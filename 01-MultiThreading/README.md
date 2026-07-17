# Multithreading in Java

This module covers core concepts of multithreading in Java, including thread creation, lifecycle, synchronization, inter-thread communication, and thread control methods.

---

## 📚 Topics Covered

### 1. Thread Creation

* Extending Thread class
* Implementing Runnable interface
* Creating and starting threads

---

### 2. Thread Lifecycle

* New
* Runnable
* Running
* Waiting / Blocked
* Terminated

---

### 3. Synchronization ⭐

* Synchronized methods and blocks
* Thread safety
* Avoiding race conditions

---

### 4. Inter-Thread Communication ⭐

* wait()
* notify()
* notifyAll()
* Producer-Consumer problem

---

### 5. Thread Methods

* sleep()
* join()
* yield()
* setPriority()

---

## 🔑 Key Concepts

* Multithreading allows multiple threads to run concurrently
* Improves performance and responsiveness
* Requires proper synchronization to avoid issues

---

## ⚠️ Common Problems

* Race condition
* Deadlock
* Thread starvation

---

## 🔥 Important Points

* Use synchronized to ensure thread safety
* Use wait() and notify() for communication
* Use join() to control execution order
* Avoid excessive thread creation

---

## 🔥 Interview Questions

### 1. What is multithreading?

Executing multiple threads concurrently.

---

### 2. Difference between Thread and Runnable?

| Thread        | Runnable      |
| ------------- | ------------- |
| Class         | Interface     |
| Less flexible | More flexible |

---

### 3. What is synchronization?

Controlling access to shared resources.

---

### 4. Difference between sleep() and wait()?

| sleep()               | wait()        |
| --------------------- | ------------- |
| Does not release lock | Releases lock |

---

### 5. What is deadlock?

Two threads waiting for each other indefinitely.

---

## 🚀 Purpose

* Understand concurrency in Java
* Build strong foundation for backend development
* Prepare for technical interviews

---

## 📌 Conclusion

This module provides a complete understanding of multithreading concepts with practical examples, helping in both interview preparation and real-world applications.

