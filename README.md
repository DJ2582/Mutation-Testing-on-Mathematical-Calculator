# Mutation Testing on Mathematical Calculator

This project is a robust Scientific Calculator application developed in Java. It provides advanced mathematical computation capabilities and ensures high code quality and test coverage through Mutation Testing. The tool is designed to handle a wide range of mathematical operations, making it a versatile tool for students, developers, and researchers alike.

## Features

### Comprehensive Mathematical Operations:
- Arithmetic calculations (addition, subtraction, multiplication, division).
- Trigonometric functions (sine, cosine, tangent, etc.).
- Logarithmic and exponential functions.
- Statistical calculations (mean, variance, standard deviation).
- Conversion utilities (e.g., Celsius to Fahrenheit, meters to centimeters).

### User-Friendly Structure:
- Well-organized Java classes for modular and maintainable code.
- Detailed logging for debugging and transparency using Log4j.

### High Code Quality:
- Implemented unit tests for all modules using JUnit.
- Mutation testing with PIT (Pitest) to validate the strength and effectiveness of the test suite.

## Technologies Used
- **Java**: Core programming language for development.
- **JUnit**: Framework for unit testing.
- **PIT (Pitest)**: For mutation testing to measure test suite effectiveness.
- **Log4j**: Logging framework for application monitoring.

## Mutation Testing Overview

### What is Mutation Testing?
- It involves introducing small changes (mutants) in the code and running the test suite to see if the tests detect these changes.

### PIT Tool:
- Applied various mutation operators, such as arithmetic operator replacement, conditional boundary changes, and boolean inversion.
- Generated a detailed mutation coverage report, ensuring high test quality.

### Example Mutation Testing Metrics:
- **Line Coverage**: 86% (e.g., 462/789 lines tested).
- **Mutation Coverage**: 96% (e.g., 224/261 mutants killed).
- **Test Strength**: High, with effective detection of introduced changes.

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/scientific-calculator.git
   cd scientific-calculator
2.	**Build the Project**:
   Use any Java IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools like Maven or Gradle.
3.	**Run Tests:**
   Execute the unit tests and view the test coverage using JUnit.
4.	**Run Mutation Tests**: Generate a mutation testing report using PIT
     ```bash 
     mvn org.pitest:pitest-maven:mutationCoverage
5.	**View Reports:**
   Open the generated PIT HTML report in the target/pit-reports directory.

## Project Structure

### 
- src/main/java/org.calculator: Contains all the mathematical computation classes.
### 
- src/test/java/org.calculator: Contains JUnit test cases.
### 
- target/pit-reports: Contains mutation testing reports.

## Contribution

### **Darshit Jakhaniya’s Contribution**
###
- Designed and implemented a variety of mathematical functions, including:
    - Solve simple equations
    - Solve quadratic equations
    - Process chain rule, product rule, log rule
    - Power, percentage, GCD, LCM, Fibonacci, Body Mass Index (BMI), and many others.
- Developed comprehensive test cases for the implemented functions to ensure correctness and robustness during mutation testing.
- Generated the PIT mutation test report and explored various approaches to improve output efficiency.
### **Brijesh Prajapati’s Contribution**
###
-	Developed mathematical functions such as:
    - Trigonometric functions (sin, cos, tan)
    - Inverse trigonometric functions (arcsine, arccosine)
    - Logarithmic functions, sum of array, mean, median, and standard deviation, among others.
- Contributed to the generation of test cases for these functions to enhance test coverage and reliability.


