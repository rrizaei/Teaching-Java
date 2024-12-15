/*
 * Author: Ravi Rizaei
 * Date: 8/16/2024
 *
 * Description:
 * This program demonstrates the use of primitive data types, the String class, comments, classes, methods, and objects in Java.
 * It explains each concept and highlights why some types are capitalized and others are not.
 */

public class Main {
    public static void main(String[] args) {
        // What are primitive data types in Java?
        // Primitive data types are the most basic data types that hold simple values directly in memory.
        // They are not objects, do not belong to any class, and are predefined by the Java language.

        // Examples of primitive data types
        int age = 25;              // Integer: Stores whole numbers without decimals
        double height = 5.9;       // Double: Stores decimal numbers
        char initial = 'R';        // Char: Stores a single character
        boolean isStudent = true;  // Boolean: Stores true or false values
        byte smallNumber = 10;     // Byte: Stores small integers from -128 to 127
        short mediumNumber = 2000; // Short: Stores integers from -32,768 to 32,767
        long largeNumber = 123456789L; // Long: Stores large integers with 'L' suffix
        float weight = 70.5f;      // Float: Stores decimal numbers with 'f' suffix

        // What is a String in Java?
        // String is a sequence of characters used to represent text.
        // Unlike primitive data types, String is a class and not a basic data type, making it an object in Java.

        // Creating a String
        String greeting = "Hello, World!"; // A String object created using double quotes

        // Displaying the values of primitive data types and String
        System.out.println("Age: " + age);              // Prints the integer value
        System.out.println("Height: " + height);        // Prints the double value
        System.out.println("Initial: " + initial);      // Prints the char value
        System.out.println("Is Student: " + isStudent); // Prints the boolean value
        System.out.println("Small Number: " + smallNumber); // Prints the byte value
        System.out.println("Medium Number: " + mediumNumber); // Prints the short value
        System.out.println("Large Number: " + largeNumber);   // Prints the long value
        System.out.println("Weight: " + weight);        // Prints the float value
        System.out.println("Greeting: " + greeting);    // Prints the String value

        // Creating an object of the Person class
        Person person = new Person("John", age, height); // Creating an object with name, age, and height

        // Accessing object's attributes and methods
        person.displayInfo(); // Calls the method to display person information

        // Using a method to set a new age
        person.setAge(30);
        person.displayInfo(); // Calls the method again to show updated information
    }
}

// What is a class in Java?
// A class is a blueprint for creating objects. It defines the attributes (data) and methods (functions) that the objects created from it will have.

// Example of a class: Person
class Person {
    // Attributes (data) of the Person class
    private String name; // Name of the person
    private int age;     // Age of the person
    private double height; // Height of the person

    // Constructor: Initializes the attributes of the Person object when created
    public Person(String name, int age, double height) {
        this.name = name; // Setting the name attribute
        this.age = age;   // Setting the age attribute
        this.height = height; // Setting the height attribute
    }

    // Method to display information about the person
    public void displayInfo() {
        // This method prints the person's name, age, and height
        System.out.println("Person Info: " + name + ", Age: " + age + ", Height: " + height);
    }

    // Method to set a new age
    public void setAge(int age) {
        // Updates the age of the person
        this.age = age;
    }
}

/*
 * Key Points:
 * - Primitive data types (int, double, char, boolean, etc.) are simple types that directly hold values in memory.
 * - String is a class, not a primitive data type, and it is capitalized because it represents an object.
 * - In Java, classes like String are capitalized because they follow the naming convention of objects and classes.
 * - Primitive types are lowercase because they are reserved keywords in Java, directly representing the simplest forms of data.
 * - Classes define the structure and behavior of objects, while methods define the actions those objects can perform.
 * - Comments help document the code, making it understandable for others and yourself.
 */
