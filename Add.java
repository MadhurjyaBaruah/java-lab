import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        int a,b,sum;
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        sum=a+b;
        System.out.println("Result is: " + sum);
       scanner.close(); 

    }

    
}
