/*
 * Author: Ravi Rizaei
 * Date: 8/7/2024
 *
 * Description:
 * This program demonstrates the use of logical operators in Java.
 * It explains the basic logical operators: AND (&&), OR (||), and NOT (!).
 * The program uses these operators to evaluate different conditions.
 */

import java.util.Scanner; // Importing Scanner for user input

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input

        // What are logical operators in Java?
        // Logical operators are used to combine or invert boolean conditions (true/false).
        // The main logical operators are: AND (&&), OR (||), and NOT (!).

        // How does the AND (&&) operator work?
        // The AND operator returns true only if both conditions are true.
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the user's age

        System.out.print("Enter your score: ");
        int score = scanner.nextInt(); // Read the user's score

        // Using AND (&&) operator to check if both conditions are true
        if (age >= 18 && score >= 50) {
            System.out.println("You are eligible."); // Executes if both conditions are true
        } else {
            System.out.println("You are not eligible."); // Executes if any condition is false
        }

        // How does the OR (||) operator work?
        // The OR operator returns true if at least one of the conditions is true.
        System.out.print("\nEnter a temperature value: ");
        int temperature = scanner.nextInt(); // Read a temperature value

        // Using OR (||) operator to check if either condition is true
        if (temperature < 0 || temperature > 30) {
            System.out.println("The temperature is extreme."); // Executes if any condition is true
        } else {
            System.out.println("The temperature is normal."); // Executes if both conditions are false
        }

        // How does the NOT (!) operator work?
        // The NOT operator inverts the boolean value, turning true into false and vice versa.
        System.out.print("\nAre you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean(); // Read boolean input (true or false)

        // Using NOT (!) operator to invert the condition
        if (!isMember) {
            System.out.println("You need to register."); // Executes if the user is NOT a member
        } else {
            System.out.println("Welcome back, member!"); // Executes if the user is a member
        }

        // Explanation:
        // 1. AND (&&): Both conditions must be true for the block to execute.
        // 2. OR (||): Only one of the conditions needs to be true for the block to execute.
        // 3. NOT (!): Inverts the condition, executing the block if the condition is false.

        scanner.close(); // Closing the scanner
    }
}
