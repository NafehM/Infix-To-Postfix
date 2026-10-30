# Infix to Postfix

Data Structures & Algorithms assignment (University of Salford, 2021–2022).

A Java implementation of a character stack, intended for use in an infix-to-postfix expression converter with a JavaFX interface.

## Projects

- **`datastructure/`** – Maven project (Java 11, JavaFX 13)
  - `Stack` – stack interface (`push`, `pop`, `peek`, `isEmpty`, `isFull`)
  - `ArrayList` – array-backed implementation of `Stack`
  - `InfixToPostfix` – JavaFX application window
  - `SystemInfo` – helper for reporting Java/JavaFX versions
- **`App1/`** – small Eclipse Java project used for experimenting

## Building

Open `datastructure/` in Eclipse or IntelliJ as a Maven project, or build it from the command line:

```bash
cd datastructure
mvn compile
```
