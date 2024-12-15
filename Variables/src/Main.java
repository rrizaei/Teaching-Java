/*
 * Author: Ravi Rizaei
 * Date: 7/26/2024
 *
 * Description:
 * This program demonstrates the use of variables in Java.
 * It covers variable declaration, initialization, updating values,
 * and various data types such as int, double, char, and boolean.
 * The program also showcases basic operations on variables.
 */

public class Main {
    public static void main(String[] args) {
        // What is a variable in Java?
        // A variable is a container that stores data that can change during program execution.

        // How do you declare and initialize a variable?
        // Declaring and initializing variables of different types
        int age = 25; // integer variable to store age
        double price = 19.99; // double variable to store a decimal value
        char grade = 'A'; // char variable to store a single character
        boolean isPassed = true; // boolean variable to store true or false values

        // Displaying initial values
        System.out.println("Initial Values:");
        System.out.println("Age: " + age); // Displays the initial value of age
        System.out.println("Price: " + price); // Displays the initial price
        System.out.println("Grade: " + grade); // Displays the grade
        System.out.println("Passed: " + isPassed); // Displays the passed status

        // How do you update a variable?
        // Updating variable values using assignment operator
        age = 30;
        price = 25.50;
        grade = 'B';
        isPassed = false;

        // Displaying updated values
        System.out.println("\nUpdated Values:");
        System.out.println("Age: " + age); // Displays the updated value of age
        System.out.println("Price: " + price); // Displays the updated price
        System.out.println("Grade: " + grade); // Displays the updated grade
        System.out.println("Passed: " + isPassed); // Displays the updated passed status

        // How are variables used in operations?
        // Performing operations on variables
        int yearsToRetirement = 65 - age; // Calculate years left until retirement
        double discount = price * 0.10; // Calculate 10% discount on the price

        // Displaying results of operations
        System.out.println("\nOperations:");
        System.out.println("Years to Retirement: " + yearsToRetirement); // Displays years left to retire
        System.out.println("Discount on Price: $" + discount); // Displays the calculated discount
    }
}
