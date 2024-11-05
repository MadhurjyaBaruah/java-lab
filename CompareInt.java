import java.util.Scanner;

public class CompareInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        boolean result = num1 > num2;
        System.out.println(result);

        sc.close();
    }
}
