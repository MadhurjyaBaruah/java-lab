import java.util.Scanner;

public class InsertArray6 {
    public static void main(String[] args) {
        int pos, x;
        Scanner s = new Scanner(System.in);
        
        // Initialize the array with predefined elements
        int[] a = {1, 2, 3, 4, 5}; // Example array with 5 elements
        int n = a.length;
        
        // Display the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        System.out.print("Enter the position where you want to insert element: ");
        pos = s.nextInt();
        
        System.out.print("Enter the element you want to insert: ");
        x = s.nextInt();
        
        // Create a new array with size n+1 to accommodate the new element
        int[] newArray = new int[n + 1];
        
        // Insert elements into the new array
        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1) {
                newArray[i] = a[i];
            } else if (i == pos - 1) {
                newArray[i] = x;
            } else {
                newArray[i] = a[i - 1];
            }
        }
        
        System.out.print("Array after insertion: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        
        s.close();
    }
}
