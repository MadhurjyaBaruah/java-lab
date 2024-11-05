import java.util.Scanner;

public class SimpleInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

      
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        
        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();

       
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The simple interest is: " + simpleInterest);
        scanner.close();
    }
}