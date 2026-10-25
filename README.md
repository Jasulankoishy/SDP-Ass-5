# Assignment 5 Strategy Pattern

A small Java calculator for Option B. It uses addition, subtraction, and multiplication strategies. No external libraries are needed. Requires JDK 17 or newer.

## Structure

```text
src/
  OperationStrategy.java
  AddStrategy.java
  SubtractStrategy.java
  MultiplyStrategy.java
  Calculator.java
  Main.java
REPORT.md
DEFENSE_RU_EN.md
README.md
```

## Build and run

Open a terminal in the project folder:

```sh
javac --release 17 -d out src/*.java
java -cp out Main
```

In IntelliJ IDEA, open the folder, select JDK 17 or newer, mark `src` as Sources Root if necessary, and run `Main.main`.

Expected output:

```text
Numbers: 12.0 and 4.0
Addition: 16.0
Subtraction: 8.0
Multiplication: 48.0
Back to addition: 16.0
```

The same Calculator object changes its strategy three times during one execution. This is runtime switching; a menu is not required to demonstrate it.

## Add a new strategy

Create a new class implementing `OperationStrategy`, for example:

```java
public class DivideStrategy implements OperationStrategy {
    @Override
    public double execute(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return first / second;
    }
}
```

Select it in client code:

```java
calculator.setStrategy(new DivideStrategy());
System.out.println(calculator.calculate(12, 4)); // 3.0
```

`Calculator`, `OperationStrategy`, and the existing strategies need no changes. The client chooses the new strategy. The zero check is input validation inside the division algorithm, not selection by strategy type.

## Submission

Repository: https://github.com/Jasulankoishy/SDP-Ass-5

Submit `REPORT.md` and the repository link to Moodle. The supplied program uses `double` and is a basic arithmetic demonstration, not a financial calculator.
