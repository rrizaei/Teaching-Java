/*
 * Author: Ravi Rizaei
 * Date: 8/6/2024
 *
 * Description:
 * This program demonstrates the use of switch statements in Java.
 * It shows how to use a switch statement to perform different actions
 * based on different conditions. The program asks the user to enter a day of the week
 * as a number and displays the corresponding day name.
 */

import java.util.Scanner; // Importing Scanner for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input

        // What is a switch statement in Java?
        // A switch statement allows you to choose between multiple options based on the value of a variable.
        // It’s a cleaner alternative to using multiple if-else statements when checking the same variable.

        // Example of switch statement: Determining the day of the week
        System.out.print("Enter a number (1 to 7) to get the corresponding day of the week: ");
        int day = scanner.nextInt(); // Read a number from the user

        // Using a switch statement
        switch (day) {
            case 1: // Case when day is 1
                System.out.println("Monday"); // Executes if day equals 1
                break; // Exits the switch statement
            case 2: // Case when day is 2
                System.out.println("Tuesday");
                break;
            case 3: // Case when day is 3
                System.out.println("Wednesday");
                break;
            case 4: // Case when day is 4
                System.out.println("Thursday");
                break;
            case 5: // Case when day is 5
                System.out.println("Friday");
                break;
            case 6: // Case when day is 6
                System.out.println("Saturday");
                break;
            case 7: // Case when day is 7
                System.out.println("Sunday");
                break;
            default: // Default case when none of the above conditions match
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

        // Explanation:
        // 1. The switch statement checks the value of the variable 'day'.
        // 2. It matches the value against each 'case'. If a match is found, 
        //    it executes the corresponding block of code.
        // 3. 'break' stops the execution and exits the switch to prevent running the next case.
        // 4. If no match is found, the 'default' case runs.

        scanner.close(); // Closing the scanner
    }
}
