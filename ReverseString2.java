import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string  : ");
        String input = scanner.nextLine();
        
        System.out.println("Reversed String: " + new StringBuilder(input).reverse());
        
        scanner.close();
    }
}
