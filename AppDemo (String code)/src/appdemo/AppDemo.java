package appdemo;

import java.util.Scanner;

public class AppDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the App class
        App app = new App();

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");

        // Read the entire line of user input
        String userInput = scanner.nextLine();

        // Check the input message using the App's checkMsg method
        String result = app.checkMsg(userInput);

        // Display the result
        System.out.println(result);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
