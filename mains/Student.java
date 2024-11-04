/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mains;

/**
 *
 * @author HP
 */

public class Student {
     private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String mobileNumber;

    // Constructor with internal validation
    public Student(String firstName, String lastName, int age, String email, String mobileNumber) {
        if (firstName.contains(" ") || lastName.contains(" ")) {
            throw new InvalidNameException("First name or last name should not contain spaces.");
        }
        
        if (!email.endsWith("@aust.edu")) {
            throw new InvalidEmailException("Email must end with '@aust.edu'.");
        }
        
        if (!mobileNumber.startsWith("+8801")) {
            throw new InvalidMobileException("Mobile number must start with '+8801'.");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}
