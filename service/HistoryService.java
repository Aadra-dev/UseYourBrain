package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Session;
import util.FileManager;

public class HistoryService {

    private List<Session> sessionHistory;

    public HistoryService() {
        sessionHistory = new ArrayList<>();
    }

    public void addSession(Session session) {
        sessionHistory.add(session);
    }

    public int getSessionCount() {
        return sessionHistory.size();
    }

    public void displayHistoryMenu(Scanner scanner, FileManager fileManager) {

        while (true) {

            System.out.println("\n========================================");
            System.out.println("        REFLECTION & HISTORY");
            System.out.println("========================================");

            System.out.println("\n1. View current session history");
            System.out.println("2. View all saved sessions");
            System.out.println("3. Back to main menu");

            System.out.print("\nEnter your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {

                case "1":
                    displayHistory();
                    break;

                case "2":
                    fileManager.displaySavedSessions();
                    break;

                case "3":
                    return;

                default:
                    System.out.println(
                            "\nInvalid choice. Please enter 1, 2, or 3."
                    );
            }
        }
    }

    public void displayHistory() {

    System.out.println("\n========================================");
        System.out.println("       CURRENT SESSION HISTORY");
    System.out.println("========================================");

        if (sessionHistory.isEmpty()) {

            System.out.println("\nNo sessions found.");
            System.out.println(
                "Complete a Decision, Research, or Brainstorm session first."
            );

            return;
        }

        System.out.println(
            "\nTotal sessions: " + sessionHistory.size()
        );

        for (int i = 0; i < sessionHistory.size(); i++) {

            Session session = sessionHistory.get(i);

    System.out.println("\n----------------------------------------");
            System.out.println("Session " + (i + 1));
    System.out.println("----------------------------------------");

            System.out.println(
                "Type: " + session.getSessionType()
            );

            System.out.println(
                session.getSummary()
            );
        }

    System.out.println("\n========================================");
    }
        
}
