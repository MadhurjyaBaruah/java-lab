import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
    // Create a Scanner object to read input from the console
    Scanner scanner = new Scanner(System.in);
    // Prompt the user to enter their name
    System.out.print("Enter your name: ");
    
    // Read the user input as a String
    String name = scanner.nextLine();
    
    // Display the user input
    System.out.println("Hello, " + name + "!");
    // Close the scanner
    scanner.close();
    }
   }
   
