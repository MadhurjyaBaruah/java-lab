import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        
        System.out.println("Enter the numbers:");
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}