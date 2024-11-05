import java.util.Scanner;

public class CharIncrementDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        char incrementedChar = (char) (ch + 1);
        System.out.println("Increment of '" + ch + "' is: " + incrementedChar);

        char decrementedChar = (char) (ch - 1);
        System.out.println("Decrement of '" + ch + "' is: " + decrementedChar);

        sc.close();
    }
}
