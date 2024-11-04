/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class MainS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);

        try {
            // Taking input from the user
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter mobile number: ");
            String mobileNumber = scanner.nextLine();

            // Attempt to create a Student object
            Student student = new Student(firstName, lastName, age, email, mobileNumber);
            student.displayInfo(); // Display student info if creation succeeds

        } catch (InvalidNameException | InvalidEmailException | InvalidMobileException e) {
            // Catch specific exceptions and display the error message
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close scanner
        }
    }
}