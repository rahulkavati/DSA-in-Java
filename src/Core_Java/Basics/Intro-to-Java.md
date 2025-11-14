# 🔠 Java Data Types

## 🧭 Overview
Data types in Java define the **type of data a variable can hold**.  
They help the compiler allocate memory efficiently and ensure type safety.

---

## 🧱 Main Categories
Java data types are divided into two main types:

### 1. **Primitive Data Types**
These are the most basic built-in types in Java — they hold **simple values**, not objects.

| Type | Size | Example | Description |
|------|------|----------|-------------|
| `byte` | 1 byte | `byte a = 10;` | Small integers (-128 to 127) |
| `short` | 2 bytes | `short b = 3000;` | Larger integers |
| `int` | 4 bytes | `int x = 100000;` | Common integer type |
| `long` | 8 bytes | `long l = 123456789L;` | Very large integers |
| `float` | 4 bytes | `float f = 3.14f;` | Decimal numbers (less precision) |
| `double` | 8 bytes | `double d = 9.81;` | Decimal numbers (more precision) |
| `char` | 2 bytes | `char c = 'A';` | Single Unicode character |
| `boolean` | 1 bit | `boolean isTrue = true;` | True or false values |

➡️ **Key Note:** Primitive types store **actual values** directly in memory.

---

### 2. **Non-Primitive (Reference) Data Types**
Non-primitive types refer to **objects or references to memory locations**, not direct values.  
They are more flexible and are defined by **classes**.

| Type | Example | Description |
|------|----------|-------------|
| `String` | `"Hello"` | Sequence of characters (actually an object of `String` class) |
| `Array` | `{1, 2, 3}` | Collection of similar type elements |
| `Class` | `Student s = new Student();` | Blueprint for creating objects |
| `Interface` | `Runnable r = ...` | Defines abstract behavior (contracts) |
| `Object` | `Object obj = new Object();` | Parent of all Java classes |

➡️ **All objects** (both built-in like `String`, and user-defined like `Student`) are **non-primitive** because they store *references* to data in heap memory.

---

## 💡 Example
```java
public class DataTypesDemo {
    public static void main(String[] args) {
        // Primitive types
        int age = 21;
        double price = 99.99;
        char grade = 'A';
        boolean isStudent = true;

        // Non-primitive types
        String name = "Simarpreet";

        // Object example
        Student s1 = new Student("Simarpreet", 21);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Student Object: " + s1.name + " (" + s1.age + ")");
    }
}

class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
}
