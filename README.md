# CSC-142 Notes

Java programming course exercises and examples from West Chester University.

## 📁 Repository Structure

### Week 2: Basic Java Programs
Programs introducing fundamental Java syntax and output.

- **[Hello.java](week2/Hello.java)** - Classic "Hello, World!" program
- **[Main.java](week2/Main.java)** - ASCII art using string repetition ("FEAR THE TREE!")
- **[Print.java](week2/Print.java)** - Demonstrates calling another class's main method
- **[Ex2.java](week2/Ex2.java)** - Empty class template

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

## 🚀 Running the Programs

Each program can be compiled and run using:
```bash
javac week#/FileName.java
java week#.FileName
```

Example:
```bash
javac week3/A2.java
java week3.A2
```

## 📖 Course Information

**Course**: CSC-142
**Institution**: West Chester University
**Topics**: Java fundamentals, expressions, variables, data types, basic algorithms