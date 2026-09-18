package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

    private static final String FILE_NAME = "useyourbrain_history.txt";

    public void saveSession(String sessionType, String summary) {

        try (FileWriter fileWriter =
                     new FileWriter(FILE_NAME, true);
             PrintWriter writer =
                     new PrintWriter(fileWriter)) {

            writer.println("========================================");
            writer.println("SESSION TYPE: " + sessionType);
            writer.println("========================================");
            writer.println(summary);
            writer.println();

            System.out.println("\nSession saved successfully!");

        } catch (IOException e) {

            System.out.println(
                    "\nUnable to save session: " + e.getMessage()
            );
        }
    }

    public void displaySavedSessions() {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("\nNo saved sessions found.");
            return;
        }

        try (java.util.Scanner fileScanner =
                     new java.util.Scanner(file)) {

            System.out.println("\n========================================");
            System.out.println("          SAVED SESSION HISTORY");
            System.out.println("========================================");

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

        } catch (IOException e) {

            System.out.println(
                    "\nUnable to read saved sessions: "
                    + e.getMessage()
            );
        }
    }
}