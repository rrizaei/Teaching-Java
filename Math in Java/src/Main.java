/*
 * Author: Ravi Rizaei
 * Date: 8/1/2024
 *
 * Description:
 * This program demonstrates basic math calculations in Java using user inputs.
 * It includes methods to calculate the hypotenuse of a right-angled triangle
 * using the Pythagorean theorem and evaluate the equation y = mx + b.
 * The user can input values to see the corresponding outputs.
 */

import java.util.Scanner; // Importing Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input

        // How to calculate the hypotenuse of a triangle?
        // The hypotenuse can be calculated using the formula: c = √(a² + b²)

        // Prompting user to enter the sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble(); // Read the value for side 'a'

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble(); // Read the value for side 'b'

        double hypotenuse = calculateHypotenuse(a, b); // Calling the method to calculate the hypotenuse
        System.out.println("Hypotenuse of the triangle with sides " + a + " and " + b + " is: " + hypotenuse);

        // How to evaluate y = mx + b?
        // The formula y = mx + b is used to describe a linear equation where:
        // 'm' is the slope, 'b' is the y-intercept, and 'x' is the input value.

        // Prompting user to enter the values for m, x, and b
        System.out.print("\nEnter the slope (m): ");
        double m = scanner.nextDouble(); // Read the value for slope 'm'

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble(); // Read the value for 'x'

        System.out.print("Enter the y-intercept (b): ");
        double bValue = scanner.nextDouble(); // Read the value for y-intercept 'b'

        double y = calculateY(m, x, bValue); // Calling the method to calculate y
        System.out.println("For m = " + m + ", x = " + x + ", and b = " + bValue + ", y = " + y);

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to calculate the hypotenuse of a triangle using the Pythagorean theorem
    public static double calculateHypotenuse(double a, double b) {
        // The formula is c = Math.sqrt(a * a + b * b)
        return Math.sqrt(a * a + b * b); // Calculate and return the hypotenuse
    }

    // Method to evaluate y = mx + b
    public static double calculateY(double m, double x, double b) {
        // The formula is y = m * x + b
        return m * x + b; // Calculate and return y
    }
}
