import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyWithConfirmation12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get source and destination file names from the user
        System.out.print("Enter the source file path: ");
        String sourceFilePath = scanner.nextLine();

        System.out.print("Enter the destination file path: ");
        String destinationFilePath = scanner.nextLine();

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        // Check if the source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist. Exiting program.");
           // return;
        }

        // Check if the destination file already exists
        if (destinationFile.exists()) {
            System.out.print("The destination file already exists. Do you want to overwrite it? (yes/no): ");
            String response = scanner.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Operation cancelled. Exiting program.");
                //return;
            }
        }

        // Perform file copy operation
        try (
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
