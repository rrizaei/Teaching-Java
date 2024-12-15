/*
 * Author: Ravi Rizaei
 * Date: 7/30/2024
 *
 * Description:
 * This program demonstrates how to use JOptionPane in Java to create simple
 * dialog boxes. It covers displaying message dialogs, input dialogs, and
 * confirmation dialogs using JOptionPane, making it easy to interact with the user.
 */

import javax.swing.JOptionPane; // Importing JOptionPane for dialog boxes

public class Main {
    public static void main(String[] args) {
        // What is JOptionPane in Java?
        // JOptionPane is a part of Swing used to create standard dialog boxes
        // like message dialogs, input dialogs, and confirmation dialogs.

        // How do you display a message dialog?
        // Example: Displaying a simple message dialog
        JOptionPane.showMessageDialog(null, "Welcome to JOptionPane GUI!");
        // Displays a message dialog with a message and an OK button

        // How do you get user input using JOptionPane?
        // Example: Displaying an input dialog to get user input
        String name = JOptionPane.showInputDialog("Enter your name:");
        // Displays an input dialog and stores the user input in the variable 'name'

        // How do you display a confirmation dialog?
        // Example: Displaying a confirmation dialog with Yes/No options
        int response = JOptionPane.showConfirmDialog(null, "Do you like Java?", "Confirmation",
                JOptionPane.YES_NO_OPTION);
        // Displays a confirmation dialog with Yes and No options and stores the user's response

        // Displaying the results based on user input
        String message = "Hello, " + name + "!";
        if (response == JOptionPane.YES_OPTION) {
            message += " Great to hear that you like Java!";
        } else {
            message += " That's okay, maybe you'll like it soon!";
        }

        // Displaying the final message
        JOptionPane.showMessageDialog(null, message); // Shows the final message based on user input
    }
}
