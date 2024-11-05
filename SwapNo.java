import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){;

     
        System.out.print("Enter the first number: ");
        int firstNumber1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

       
       // System.out.println("Before swapping: ");
       // System.out.println("First number = " + firstNumber);
       // System.out.println("Second number = " + secondNumber);

        
        int temp = firstNumber1;
        firstNumber1 = secondNumber;
        secondNumber = temp;

        
        

        //System.out.println("After swapping: ");
        System.out.println("First number : " + firstNumber1);
        System.out.println("Second number : " + secondNumber);

        //scanner.close();
    }
}

}