/*
 * Author: Ravi Rizaei
 * Date: 8/4/2024
 *
 * Description:
 * This program demonstrates the concepts of objects and methods in Java.
 * It explains what an object is, how to create an object from a class,
 * and provides an example of using methods to interact with data.
 * Methods are actions defined within a class that objects can perform.
 */

public class Main {
    public static void main(String[] args) {
        // What is an object in Java?
        // An object is an instance of a class. It represents a real-world entity
        // with attributes (data) and behaviors (methods). Objects are used to interact
        // with and manipulate data defined by their class.

        // What is a method in Java?
        // A method is a block of code that performs a specific task. 
        // It is a way for an object to perform an action or calculate a value.

        // How do you create an object?
        // To create an object, use the 'new' keyword followed by the class name.
        // Example: Creating an object of the class 'Person'

        // Creating a Person object
        Person person = new Person("John", 25); // Creating an object with name and age

        // Accessing object's attributes and methods
        System.out.println("Name: " + person.getName()); // Calls the method getName() to get the person's name
        System.out.println("Age: " + person.getAge()); // Calls the method getAge() to get the person's age

        // Updating object's attributes using methods
        person.setName("Alice"); // Calls the method setName() to change the name
        person.setAge(30); // Calls the method setAge() to change the age

        // Displaying updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Demonstrating a custom method
        System.out.println(person.introduce()); // Calls the introduce() method to display a custom message
    }
}

// Defining a class called 'Person'
class Person {
    // Attributes (data) of the Person class
    private String name; // Name of the person
    private int age; // Age of the person

    // Constructor: Initializes the object's attributes when created
    public Person(String name, int age) {
        this.name = name; // Setting the object's name attribute
        this.age = age; // Setting the object's age attribute
    }

    // Getter method to get the name of the person
    public String getName() {
        return name; // Returns the object's name
    }

    // Setter method to set the name of the person
    public void setName(String name) {
        this.name = name; // Updates the object's name
    }

    // Getter method to get the age of the person
    public int getAge() {
        return age; // Returns the object's age
    }

    // Setter method to set the age of the person
    public void setAge(int age) {
        this.age = age; // Updates the object's age
    }

    // Custom method to introduce the person
    // This method shows how objects can have custom behaviors
    public String introduce() {
        return "Hi, my name is " + name + " and I am " + age + " years old."; // Returns a string introducing the person
    }
}
