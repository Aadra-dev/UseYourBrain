import java.util.Scanner;
import java.util.InputMismatchException;

import model.DecisionSession;
import model.ResearchSession;
import model.BrainstormSession;

import service.DecisionService;
import service.HistoryService;
import service.ResearchService;
import service.BrainstormService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecisionService decisionService = new DecisionService();
        HistoryService historyService = new HistoryService();
        ResearchService researchService = new ResearchService();
        BrainstormService brainstormService = new BrainstormService();

        System.out.println("========================================");
        System.out.println("              USEYOURBRAIN");
        System.out.println("      Think • Research • Decide");
        System.out.println("========================================");

        System.out.println();
        System.out.println("Welcome to UseYourBrain!");
        System.out.println("A space to think before you ask AI.");
        System.out.println();

        boolean running = true;

        while (running) {

            System.out.println("\n------------- MAIN MENU -------------");
            System.out.println("1. Decision Mode");
            System.out.println("2. Research Mode");
            System.out.println("3. Brainstorm Mode");
            System.out.println("4. Reflection & History");
            System.out.println("5. Exit");
            System.out.println("-------------------------------------");

            System.out.print("Enter your choice: ");

            int choice;

try {
    choice = scanner.nextInt();
    scanner.nextLine(); // consume leftover newline
} catch (InputMismatchException e) {
    System.out.println("\nInvalid input!");
    System.out.println("Please enter a number between 1 and 5.");
    scanner.nextLine(); // clear invalid input
    continue;
}

            switch (choice) {

                case 1:

                    DecisionSession session = decisionService.startDecisionSession(scanner);

                    session.displaySummary();

                    historyService.addSession(session);

                    System.out.println("\nRemember:");
                    System.out.println("Use AI to assist your thinking —");
                    System.out.println("not to replace it.");

                    break;

                case 2:

                    ResearchSession researchSession = researchService.startResearchSession(scanner);

                    researchSession.displaySummary();

                    break;

                case 3:

                    BrainstormSession brainstormSession = brainstormService.startBrainstormSession(scanner);

                    brainstormSession.displaySummary();

                    break;

                case 4:

                    historyService.displayHistory();

                    break;

                case 5:
                    running = false;
                    System.out.println("\nThank you for using UseYourBrain!");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please enter 1-5.");
            }
        }

        scanner.close();
    }
    
}

