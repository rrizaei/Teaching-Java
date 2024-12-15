/*
 * Author: Ravi Rizaei
 * Date: 7/28/2024
 *
 * Description:
 * This program demonstrates arithmetic expressions in Java.
 * It covers basic arithmetic operations including addition, subtraction,
 * multiplication, division, and modulus. It also shows how to combine these
 * operations in expressions and how to handle operator precedence.
 */

public class Main {
    public static void main(String[] args) {
        // What are arithmetic expressions in Java?
        // Arithmetic expressions are combinations of numbers, variables, and operators
        // that compute a value using basic math operations.

        // How do you perform basic arithmetic operations?
        // Example of basic arithmetic operations

        int a = 10; // Declare an integer variable a with value 10
        int b = 5;  // Declare an integer variable b with value 5

        // Addition
        int sum = a + b; // Adds a and b
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        // Subtraction
        int difference = a - b; // Subtracts b from a
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        // Multiplication
        int product = a * b; // Multiplies a and b
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        // Division
        int quotient = a / b; // Divides a by b (integer division)
        System.out.println("Division: " + a + " / " + b + " = " + quotient);

        // Modulus
        int remainder = a % b; // Finds the remainder of a divided by b
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);

        // How do you handle combined expressions and operator precedence?
        // Example: Combined arithmetic expression with multiple operations
        int result = (a + b) * (a - b) / b; // Combined operation showing precedence
        // Operations inside parentheses are performed first, followed by multiplication, division, etc.
        System.out.println("Combined Expression: (" + a + " + " + b + ") * (" + a + " - " + b + ") / " + b + " = " + result);

        // Example of using double to show division with decimals
        double x = 10.0;
        double y = 3.0;
        double divisionResult = x / y; // Division resulting in a decimal value
        System.out.println("Decimal Division: " + x + " / " + y + " = " + divisionResult);
    }
}
