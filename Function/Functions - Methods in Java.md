# Functions / Methods in Java

## What is a Function?

A **function** is a reusable block of code that performs a specific task.

In Java, functions are technically called **methods** because they are defined inside a class.

### Simple Definition

> A method is a reusable block of code designed to perform a specific task.

---

## Why Do We Use Methods?

Methods help us:

- Reuse code
- Avoid writing the same code repeatedly
- Make programs easier to understand
- Make code easier to maintain
- Divide a large program into smaller tasks

---

## Basic Syntax

```java
returnType methodName(parameters) {
    // code
    return value;
}
```

### Example

```java
public static int add(int a, int b) {
    return a + b;
}
```

Here:

- `public` → access modifier
- `static` → method can be called without creating an object
- `int` → return type
- `add` → method name
- `int a, int b` → parameters
- `return a + b` → returns the result

---

## Calling a Method

After creating a method, we can call it from `main()`.

```java
public class Example {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }
}
```

### Output

```text
30
```

---

# Parameters and Arguments

These two terms are related but different.

### Parameter

The variables written when defining the method are called **parameters**.

```java
public static int add(int a, int b)
```

Here `a` and `b` are parameters.

### Argument

The actual values passed when calling the method are called **arguments**.

```java
add(10, 20);
```

Here `10` and `20` are arguments.

### Easy Way to Remember

```text
Method Definition:
add(int a, int b)
        ↑     ↑
    Parameters

Method Call:
add(10, 20)
    ↑   ↑
  Arguments
```

---

# Return Type

The return type tells us what type of value the method will return.

### Example

```java
public static int add(int a, int b) {
    return a + b;
}
```

The return type is:

```java
int
```

because the method returns an integer.

Another example:

```java
public static double calculate() {
    return 10.5;
}
```

Return type:

```java
double
```

---

# `void` Method

If a method does not return any value, we use `void`.

```java
public static void message() {
    System.out.println("Hello Java");
}
```

Calling it:

```java
message();
```

Output:

```text
Hello Java
```

There is no `return` value.

---

# Method with Parameters

A method can accept input.

```java
public static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Calling:

```java
greet("Doremon");
```

Output:

```text
Hello Doremon
```

---

# Method with Parameters and Return Value

A method can take input and return output.

```java
public static int multiply(int a, int b) {
    return a * b;
}
```

Calling:

```java
int result = multiply(5, 4);

System.out.println(result);
```

Output:

```text
20
```

---

# Your Power Example

You wrote:

```java
public static double raisedPower(int x, int n) {
    double r = Math.pow(x, n);
    return r;
}
```

This is a method.

It takes:

```text
x → base number
n → exponent
```

and returns:

```text
x^n
```

For example:

```java
double result = raisedPower(2, 5);
```

Output:

```text
32.0
```

Because:

```text
2^5 = 32
```

---

# Method Structure

Remember this basic structure:

```text
Access Modifier
       ↓
public static int add(int a, int b)
             ↑       ↑       ↑
        Return     Parameters
         Type
              ↓
          Method Name
```

A simpler way:

```java
public static int add(int a, int b) {
    return a + b;
}
```

Think:

```text
INPUT → METHOD → OUTPUT
```

Example:

```text
10, 20 → add() → 30
```

---

# Types of Methods

## 1. No Parameter + No Return Value

```java
public static void hello() {
    System.out.println("Hello");
}
```

Call:

```java
hello();
```

---

## 2. Parameter + No Return Value

```java
public static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Call:

```java
greet("Doremon");
```

---

## 3. No Parameter + Return Value

```java
public static int getNumber() {
    return 10;
}
```

Call:

```java
int number = getNumber();
```

---

## 4. Parameter + Return Value

```java
public static int add(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = add(10, 20);
```

This is one of the most commonly used types.

---

# Important Interview Points

### What is a method?

> A method is a reusable block of code that performs a specific task.

### Why are methods used?

> Methods are used for code reusability, better organization, readability, and maintainability.

### What is a parameter?

> A parameter is a variable defined in the method declaration that receives a value when the method is called.

### What is an argument?

> An argument is the actual value passed to a method when calling it.

### What is a return type?

> The return type specifies the type of value that a method returns. If a method doesn't return anything, we use `void`.

---

# Quick Revision

```text
Method
  ↓
Reusable block of code
  ↓
Performs a specific task
  ↓
Can take input
  ↓
Can return output
```

### Example

```java
public static int square(int n) {
    return n * n;
}
```

Calling:

```java
int result = square(5);
```

Result:

```text
25
```

### Remember

```text
Parameter → Input variable
Argument  → Actual value
Return    → Output from method
void      → No return value
```