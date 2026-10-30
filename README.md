# Infix to Postfix

> **University assignment:** Data Structures & Algorithms, Assignment 1 (Semester 1, second year, 2021–2022), University of Salford.

A Java project that builds a **stack data structure** from scratch and uses it to convert mathematical expressions from **infix** notation to **postfix** notation. A **JavaFX** window provides the user interface.

## What is infix to postfix?

People normally write expressions in **infix** notation, with each operator *between* its operands:

```
A + B * C
(A + B) * C
```

In **postfix** notation (also called *Reverse Polish Notation*), each operator comes *after* its operands:

```
A B C * +
A B + C *
```

Postfix needs no brackets and no precedence rules, so a computer can evaluate it in a single left-to-right pass. That's why compilers and calculators use it internally.

## How the conversion works (stack algorithm)

The conversion uses a stack to hold operators until it's their turn to be output:

1. Read the infix expression one character at a time, left to right.
2. **Operand** (a letter or digit): append it straight to the output.
3. **`(`**: push it onto the stack.
4. **`)`**: pop operators to the output until the matching `(` comes off, then discard the `(`.
5. **Operator** (`+ - * / ^`): while the operator on top of the stack has higher or equal precedence, pop it to the output. Then push the current operator.
6. At the end, pop any remaining operators to the output.

Example: `A + B * C`

| Character | Stack | Output |
|---|---|---|
| `A` | | `A` |
| `+` | `+` | `A` |
| `B` | `+` | `A B` |
| `*` | `+ *` | `A B` |
| `C` | `+ *` | `A B C` |
| end | | `A B C * +` |

## Project structure

```
├── datastructure/                      Main Maven project (Java 11, JavaFX 13)
│   ├── pom.xml
│   └── src/main/java/nafeh/datastructure/
│       ├── Stack.java                  Stack interface: push, pop, peek, isEmpty, isFull
│       ├── ArrayList.java              Fixed-size array implementation of Stack (20 chars)
│       ├── InfixToPostfix.java         JavaFX application window
│       └── SystemInfo.java             Helper for reporting Java/JavaFX versions
└── App1/                               Small Eclipse project used for experimenting
```

### Key classes

- **`Stack`**: an interface that defines the stack operations. Keeping it separate from the implementation means a different backing structure, such as a linked list, can be swapped in later.
- **`ArrayList`**: implements `Stack` with a `char[]` array and a `top` index. It holds up to 20 characters.
- **`InfixToPostfix`**: a JavaFX `Application` with a text field for entering an expression, a submit button and labels for the result.

## Concepts demonstrated

- Abstract data types and interfaces in Java
- Array-based stack implementation (LIFO)
- Operator precedence and expression parsing
- JavaFX GUI basics
- Maven project setup with Java modules (`module-info.java`)

## Project status

This was a work-in-progress coursework submission. The stack interface and `push`, `peek`, `isEmpty` and `isFull` are written. The `pop` method and the conversion logic in the GUI are not finished yet.

## Building

Requirements: **JDK 11+** and **Maven**.

Open `datastructure/` in Eclipse or IntelliJ as a Maven project, or build it from the command line:

```bash
cd datastructure
mvn compile
```

## Author

**Nafeh Mahmoud**: [github.com/NafehM](https://github.com/NafehM)
