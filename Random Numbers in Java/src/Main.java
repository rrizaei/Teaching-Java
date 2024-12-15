/*
 * Author: Ravi Rizaei
 * Date: 8/2/2024
 *
 * Description:
 * This program demonstrates how to generate random numbers in Java using the Random class.
 * It includes examples of generating random integers, doubles, and bounded values.
 * The user can input the range for generating random numbers.
 */

import java.util.Random; // Importing the Random class to generate random numbers
import java.util.Scanner; // Importing Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        Random random = new Random(); // Creating a Random object to generate random numbers

        // How do you generate random integers?
        // Example: Generating a random integer without bounds
        int randomInt = random.nextInt(); // Generates a random integer (positive or negative)
        System.out.println("Random Integer: " + randomInt);

        // How do you generate random numbers within a specific range?
        // Example: Generating a random integer within a user-defined range

        // Prompting user to enter the range for generating random numbers
        System.out.print("\nEnter the lower bound (inclusive): ");
        int lowerBound = scanner.nextInt(); // Read the lower bound

        System.out.print("Enter the upper bound (exclusive): ");
        int upperBound = scanner.nextInt(); // Read the upper bound

        // Generating a random integer within the specified range
        int boundedRandomInt = random.nextInt(upperBound - lowerBound) + lowerBound;
        System.out.println("Random Integer between " + lowerBound + " and " + upperBound + ": " + boundedRandomInt);

        // How do you generate random double values?
        // Example: Generating a random double value between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble = random.nextDouble(); // Generates a random double between 0.0 and 1.0
        System.out.println("\nRandom Double between 0.0 and 1.0: " + randomDouble);

        // Generating a random double within a user-specified range
        System.out.print("\nEnter the lower bound for a double (inclusive): ");
        double doubleLowerBound = scanner.nextDouble(); // Read the lower bound for double

        System.out.print("Enter the upper bound for a double (exclusive): ");
        double doubleUpperBound = scanner.nextDouble(); // Read the upper bound for double

        // Calculate a random double within the specified range
        double boundedRandomDouble = doubleLowerBound + (doubleUpperBound - doubleLowerBound) * random.nextDouble();
        System.out.println("Random Double between " + doubleLowerBound + " and " + doubleUpperBound + ": " + boundedRandomDouble);

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}
