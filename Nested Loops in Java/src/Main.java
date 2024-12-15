/*
 * Author: Ravi Rizaei
 * Date: 8/10/2024
 *
 * Description:
 * This program demonstrates the use of nested loops in Java.
 * It explains how nested loops work by running loops inside other loops,
 * with examples showing multiplication tables and printing patterns.
 */

public class Main {
    public static void main(String[] args) {
        // What is a nested loop in Java?
        // A nested loop is a loop inside another loop. The inner loop executes completely
        // for each iteration of the outer loop. Nested loops are often used for working with
        // multi-dimensional data like matrices or creating complex patterns.

        // Example 1: Multiplication table using nested loops
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 5; i++) { // Outer loop: controls the rows (1 to 5)
            for (int j = 1; j <= 5; j++) { // Inner loop: controls the columns (1 to 5)
                System.out.print(i * j + "\t"); // Prints the product of i and j
            }
            System.out.println(); // Moves to the next line after each row
        }

        // Explanation:
        // 1. The outer loop runs from 1 to 5, controlling the rows of the table.
        // 2. For each iteration of the outer loop, the inner loop runs from 1 to 5, controlling the columns.
        // 3. The inner loop completes all its iterations before the outer loop moves to the next iteration.

        // Example 2: Printing a pattern using nested loops
        System.out.println("\nPattern Printing:");
        for (int i = 1; i <= 5; i++) { // Outer loop: controls the number of rows
            for (int j = 1; j <= i; j++) { // Inner loop: controls the number of stars printed in each row
                System.out.print("* "); // Prints a star followed by a space
            }
            System.out.println(); // Moves to the next line after each row
        }

        // Explanation:
        // 1. The outer loop controls how many rows are printed.
        // 2. The inner loop controls how many stars are printed in each row,
        //    matching the current row number (i), creating a growing pattern.

        // Key Points:
        // - Nested loops are powerful for creating grids, tables, or patterns.
        // - Each iteration of the outer loop triggers a full run of the inner loop.
    }
}
