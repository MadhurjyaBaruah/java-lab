import java.io.File;
import java.util.Scanner;

public class ListFilesPattern14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file pattern (e.g., *.txt): ");
        String pattern = scanner.nextLine();

        File directory = new File("D:\\KU\\RandomFile");
        File[] files = directory.listFiles((dir, name) -> name.endsWith(pattern.substring(1)));

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found with the pattern " + pattern);
        }
        scanner.close();
    }
}
