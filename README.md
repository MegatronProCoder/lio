# Programming Interpreter

A Java implementation of a simple interpreter.

## Running the Interpreter

### Run a Lox program

Pass the Lox file using the `File` variable:

```bash
make run File=fib.txt
```

Other examples:

```bash
make run File=closure.txt
```

```bash
make run File=recurssion.txt
```

You can also run your own `.txt` Lox program:

```bash
make run File=your_program.txt
```

### Run Interactive Mode

To open the Lox prompt:

```bash
make runPrompt
```

You can then enter Lox code directly:

```text
> var x = 10;
> print x;
10
```

## Language Features

The interpreter currently supports:

* **Variable declarations**

  ```text
  var x = 10;
  ```

* **Expressions and arithmetic**

  ```text
  print 10 + 20;
  ```

* **if / else statements**

  ```text
  if (x > 10) {
      print "greater";
  } else {
      print "smaller";
  }
  ```

* **while loops**

  ```text
  while (x < 10) {
      print x;
      x = x + 1;
  }
  ```

* **Functions**

  ```text
  fun add(a, b) {
      return a + b;
  }
  ```

* **Closures**

  Functions can capture and access variables from their surrounding scope.

* **Recursion**

  Functions can call themselves recursively.

* **Classes and methods**

  ```text
  class Person {
      sayHello() {
          print "Hello!";
      }
  }
  ```

## Example Programs

The repository contains example programs demonstrating different language features:

| File             | Demonstrates          |
| ---------------- | --------------------- |
| `fib.txt`        | Fibonacci / recursion |
| `closure.txt`    | Closures              |
| `recurssion.txt` | Recursive functions   |


## Requirements

* Java JDK
* GNU Make

Check your Java installation:

```bash
java --version
javac --version
```

Check Make:

```bash
make --version
```

## Cleaning Compiled Files

To remove compiled `.class` files:

```bash
make clean
```
