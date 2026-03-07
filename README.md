# CSC-142 Notes

Java programming course exercises and examples from West Chester University.

## 📁 Repository Structure

### Week 2: Basic Java Programs
Programs introducing fundamental Java syntax and output.

- **[Hello.java](week2/Hello.java)** - Classic "Hello, World!" program
- **[Main.java](week2/Main.java)** - ASCII art using string repetition ("FEAR THE TREE!")
- **[Print.java](week2/Print.java)** - Demonstrates calling another class's main method

### Week 3: Expressions, Variables & Data Types
Programs exploring Java arithmetic, expressions, variables, and data type behavior.

#### Expression Evaluation
- **[expressions.java](week3/expressions.java)** - String concatenation with numbers and operator precedence
- **[maths.java](week3/maths.java)** - Arithmetic expression problems (Questions 5-6)
- **[maths2.java](week3/maths2.java)** - Extended arithmetic problems (Questions 7-15) with modulus and division
- **[numbers37.java](week3/numbers37.java)** - Complex nested arithmetic expressions

#### Variable Manipulation
- **[printMaxMin.java](week3/printMaxMin.java)** - Variable assignment and modification tracking
- **[valuesOfABC.java](week3/valuesOfABC.java)** - Tracing values of variables a, b, c through operations
- **[valuesOfIJK.java](week3/valuesOfIJK.java)** - Variable swapping and transformation logic

#### Physics Application
- **[A2.java](week3/A2.java)** - **Displacement formula calculator**
  - Implements physics equation: `s = s₀ + v₀t + ½at²`
  - Calculates final displacement given initial position, velocity, acceleration, and time
  - Example: Initial position 12m, velocity 3.5 m/s, acceleration 9.8 m/s², time 10s → 537m

#### Reference Notes
- **[notes.java](week3/notes.java)** - Comments listing Java's 8 primitive data types

### Week 5: Intro Problems & Practice
Early practice problems focused on methods, output, and simple logic.

- **[A3.java](week5/A3.java)**
- **[Ex2.java](week5/Ex2.java)**

### Week 6: Loops, Patterns & Nested Iteration
Programs focused on `for` loops, nested loops, and console pattern output.

- **Pattern / shape output**: `AsciiFigure.java`, `Mirror.java`, `starsPrint.java`, `nestedStarsOutput.java`, `floydsTriangle.java`
- **Loop drills**: `forLoops.java`, `loopMysteryPrint1.java`, `sequenceOfNumbers.java`, `tableOutput.java`
- **Number loop exercises**: `numberLoops1.java`, `numberLoops2.java`, `numberLoops3.java`, `numberLoops4constant.java`
- **Examples / misc**: `Example.java`, `Example3.java`, `Ex9.java`, `Ex10.java`, `Scope.java`, `bottlesOfRootBeer.java`

### Week 7: Methods, Parameters & Return Values
Programs introducing parameter passing, return values, and small computational methods.

- **Computation methods**: `averageOf3.java`, `circleArea.java`, `computeDistance.java`, `factorial.java`, `getLastDigit.java`, `sumOfRange.java`, `printPay.java`
- **Output / geometry**: `boxOfStars.java`, `triangle.java`, `OneTwoThree.java`, `Hogwarts.java`
- **Parameter/return tracing**: `ParameterMystery1.java`, `ParameterMysteryExam3.java`, `ParameterMysteryExam4.java`, `ParameterMysteryExam5.java`, `ParameterMysterySection1.java`, `ParameterMysterySection2.java`, `ReturnMystery1.java`, `MysteryGhost.java`

## 📚 Key Concepts Covered

### Data Types
- **Primitive types**: byte, short, int, long, float, double, char, boolean
- **Type precision**: Understanding float (32-bit, 7 digits) vs double (64-bit, 15-16 digits)
- **Type mixing**: Behavior when mixing integers and floating-point in expressions

### Operators & Expressions
- Arithmetic operators: `+`, `-`, `*`, `/`, `%` (modulus)
- Operator precedence and associativity
- Integer vs floating-point division
- String concatenation with numeric types

### Variables
- Variable declaration and initialization
- Assignment and reassignment
- Tracking variable state changes
- Variable naming conventions

### Physics Formula Implementation
- Kinematic equations in code
- Using appropriate data types for scientific calculations
- Documenting formulas with comments and units

### Loops & Pattern Generation
- Basic and nested `for` loops
- Counting and sequence construction
- Text/ASCII shape generation using loops

### Methods & Parameters
- Writing methods with parameters
- Returning computed values
- Tracing method calls and argument passing

## 🚀 Running the Programs

Because this repo includes both packaged and non-packaged classes, use one of these patterns from the repository root:

### Option 1: Non-packaged files (for example, `week2/Hello.java`)
```bash
javac week2/Hello.java
java -cp week2 Hello
```

### Option 2: Packaged files (for example, `week3/A2.java` with `package week3;`)
```bash
javac week3/A2.java
java week3.A2
```

## 📖 Course Information

**Course**: CSC-142
**Institution**: West Chester University
**Topics**: Java fundamentals, expressions, variables, data types, basic algorithms