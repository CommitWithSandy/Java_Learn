# Functions and Methods in Java

## 1. What is a Function?

A **function** is a reusable block of code that performs a particular task.

For example:

```java
int add(int a, int b) {
    return a + b;
}
```

The purpose of this block is to add two numbers.

### Simple idea

```text
Input → Function → Output
```

Example:

```text
10, 20 → add() → 30
```

---

# 2. Function vs Method — The Important Difference

This is where beginners often get confused.

### Function

**Function** is a general programming term for a reusable block of code that performs a task.

Some programming languages allow functions to exist independently.

For example, JavaScript:

```javascript
function add(a, b) {
    return a + b;
}
```

This function can exist independently.

It does not have to belong to a class.

---

### Method

A **method is a function-like block of code that belongs to a class or object.**

Example in Java:

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }
}
```

Here `add()` is a **method** because it is defined inside the `Calculator` class.

---

# 3. What About Java?

This is the most important thing to remember:

> **Java does not have standalone functions. Java uses methods.**

Java requires executable code like `add()` to be defined inside a class.

Therefore, when writing Java, prefer the word:

**METHOD**

rather than:

**FUNCTION**

People may casually say "function" while talking about Java, and you'll understand what they mean, but technically **method** is the correct Java terminology.

---

# 4. Why Do People Say "Java Function"?

You may see or hear:

> "Create a function to calculate the power."

This is usually informal language.

The technically correct Java version is:

> "Create a method to calculate the power."

For example:

```java
public static double raisedPower(int x, int n) {
    return Math.pow(x, n);
}
```

`raisedPower()` is technically a **method**.

---

# 5. Easy Way to Remember

Remember this:

```text
FUNCTION
   ↓
General concept
   ↓
Reusable block of code
```

```text
METHOD
   ↓
A function associated with a class/object
```

And specifically:

```text
JAVA
  ↓
Methods
  ↓
Methods are defined inside classes
```

### One-line memory trick

> **Every method is function-like, but not every function is a method.**

---

# 6. Basic Java Method Structure

```java
public static int add(int a, int b) {
    return a + b;
}
```

Break it down:

```text
public       → Access modifier
static       → Can be called using the class without creating an object
int          → Return type
add          → Method name
(int a, int b) → Parameters
return       → Sends the result back
```

---

# 7. Parameters

**Parameters** are variables written in the method definition.

```java
public static int add(int a, int b)
```

Here:

```text
a and b → Parameters
```

They represent the input that the method expects.

---

# 8. Arguments

**Arguments** are the actual values passed when calling the method.

```java
add(10, 20);
```

Here:

```text
10 and 20 → Arguments
```

### Remember

```text
Method definition:
add(int a, int b)
       ↑     ↑
   Parameters


Method call:
add(10, 20)
    ↑   ↑
  Arguments
```

---

# 9. Return Type

The **return type** tells Java what type of value the method will return.

Example:

```java
public static int add(int a, int b) {
    return a + b;
}
```

Return type:

```text
int
```

because the method returns an integer.

Another example:

```java
public static double getPrice() {
    return 99.50;
}
```

Return type:

```text
double
```

---

# 10. `void` Method

`void` means:

> **This method does not return a value.**

Example:

```java
public static void greet() {
    System.out.println("Hello");
}
```

Calling:

```java
greet();
```

The method performs an action but does not give a value back.

### Important

`void` does NOT mean the method cannot do anything.

It can:

- print something
- modify variables
- perform calculations
- call other methods
- perform some task

It simply **doesn't return a value to the caller**.

---

# 11. `return` Keyword

`return` has two important purposes.

## Purpose 1: Return a value

```java
public static int add(int a, int b) {
    return a + b;
}
```

The result is sent back to the caller.

```java
int result = add(10, 20);
```

Now:

```text
result = 30
```

---

## Purpose 2: Stop the method

A `void` method can also use:

```java
return;
```

Example:

```java
public static void check(int n) {

    if (n < 0) {
        return;
    }

    System.out.println("Positive number");
}
```

Here `return;` means:

> Stop executing this method.

But this is NOT allowed:

```java
public static void test() {
    return 10;   // ❌
}
```

Because `void` cannot return a value.

---

# 12. Four Common Types of Methods

## Type 1: No Parameter + No Return

```java
public static void hello() {
    System.out.println("Hello");
}
```

Call:

```java
hello();
```

```text
Input:  None
Output: None
```

---

## Type 2: Parameter + No Return

```java
public static void greet(String name) {
    System.out.println("Hello " + name);
}
```

Call:

```java
greet("Doremon");
```

```text
Input:  String
Output: None
```

---

## Type 3: No Parameter + Return

```java
public static int getNumber() {
    return 10;
}
```

Call:

```java
int number = getNumber();
```

```text
Input:  None
Output: int
```

---

## Type 4: Parameter + Return

```java
public static int add(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = add(10, 20);
```

```text
Input:  a, b
Output: int
```

This type is very common.

---

# 13. Method Calling

Creating a method does not automatically execute it.

Example:

```java
public static void hello() {
    System.out.println("Hello");
}
```

You must call it:

```java
public static void main(String[] args) {
    hello();
}
```

Think:

```text
Define method
     ↓
Call method
     ↓
Method executes
```

---

# 14. Method Example

```java
public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);
    }
}
```

Output:

```text
30
```

Flow:

```text
main()
  ↓
add(10, 20)
  ↓
a = 10
b = 20
  ↓
a + b
  ↓
30
  ↓
return 30
  ↓
result = 30
```

---

# 15. Scope of Variables

A variable created inside a method generally belongs to that method.

Example:

```java
public static void test() {

    int num = 10;
}
```

You cannot directly do this:

```java
public static void main(String[] args) {

    System.out.println(num); // ❌
}
```

because `num` belongs to `test()`.

### Remember

> **A local variable has scope within the block/method where it is declared.**

This is an important beginner concept.

---

# 16. Common Beginner Mistakes

### Mistake 1: Forgetting to call the method

```java
public static void hello() {
    System.out.println("Hello");
}
```

Defining it alone does not execute it.

Call:

```java
hello();
```

---

### Mistake 2: Forgetting `return`

Wrong:

```java
public static int add(int a, int b) {
    a + b; // ❌
}
```

Correct:

```java
public static int add(int a, int b) {
    return a + b;
}
```

---

### Mistake 3: Returning a value from `void`

Wrong:

```java
public static void test() {
    return 10; // ❌
}
```

Correct:

```java
public static int test() {
    return 10;
}
```

---

### Mistake 4: Confusing parameter and argument

```java
add(int a, int b);
```

`a` and `b` → parameters

```java
add(10, 20);
```

`10` and `20` → arguments

---

### Mistake 5: Using a variable outside its scope

```java
public static void test() {
    int num = 10;
}

public static void main(String[] args) {
    System.out.println(num); // ❌
}
```

---

### Mistake 6: Using `return` when you only want to print

Printing:

```java
System.out.println(result);
```

Returning:

```java
return result;
```

They are different.

```text
println → displays the value
return  → sends the value back
```

---

### Mistake 7: Returning too early

```java
public static int test(int n) {

    if (n > 0) {
        return 1;
    }

    System.out.println("Checking...");

    return 0;
}
```

Once Java executes:

```java
return 1;
```

the method immediately stops.

---

# 17. Your Power Example

Your method:

```java
public static double raisedPower(int x, int n) {

    double r = Math.pow(x, n);

    return r;
}
```

Breakdown:

```text
public
   ↓
Access modifier

static
   ↓
Can call without creating object

double
   ↓
Return type

raisedPower
   ↓
Method name

int x, int n
   ↓
Parameters

return r
   ↓
Returns result
```

Calling it:

```java
double result = raisedPower(2, 5);
```

```text
2, 5
 ↓
raisedPower()
 ↓
2⁵
 ↓
32.0
```

---

# 18. Function vs Method — Final Revision

| Concept | Meaning |
|---|---|
| Function | General term for reusable code that performs a task |
| Method | Function-like code that belongs to a class/object |
| Java | Uses methods; no standalone functions |
| Parameter | Variable in method definition |
| Argument | Actual value passed to method |
| Return type | Type of value method returns |
| `return` | Sends value back / stops method |
| `void` | Method doesn't return a value |
| Method call | Executes the method |

---

# ⭐ 30-Second Revision

If you have only 30 seconds before an interview, remember this:

> **A function is a reusable block of code that performs a specific task. A method is a function-like block associated with a class or object. Java does not support standalone functions, so Java uses methods. A method can take parameters and can return a value. `void` means the method does not return a value. `return` sends a value back to the caller or, with `return;`, simply exits the method.**

### Most important terms

```text
Method
  ↓
Name
  ↓
Parameters
  ↓
Input
  ↓
Processing
  ↓
Return
  ↓
Output
```

### Best Java terminology

❌ "Java standalone function"

❌ "Java function" (technically informal)

✅ **"Java method"**

---

## One final mental model

```text
                METHOD
                   │
          ┌────────┴────────┐
          │                 │
       INPUT             OUTPUT
    Parameters          Return value
          │                 │
          ↓                 ↑
       ┌─────────────────────┐
       │   CODE / LOGIC      │
       │                     │
       │   Performs task     │
       └─────────────────────┘
```

**Remember:**  
`void` = **does a task, returns no value**  
`int/double/String/...` = **does a task and returns that type**  
`parameter` = **input variable**  
`argument` = **actual input value**  
`method` = **Java's term for a function-like block inside a class**