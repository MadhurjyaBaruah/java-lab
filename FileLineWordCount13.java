import java.io.*;
import java.util.Scanner;

public class FileLineWordCount13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            int wordCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                wordCount += line.split("\\s+").length;
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
       scanner.close();
    }
   
}
