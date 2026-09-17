package service;

import java.util.Scanner;
import model.DecisionSession;

public class DecisionService {

    public DecisionSession startDecisionSession(Scanner scanner) {

        System.out.println("\n=================================");
        System.out.println("          DECISION MODE");
        System.out.println("=================================");

        String decision = getNonEmptyInput(scanner,
                "\nWhat decision are you trying to make? ");

        String initialBelief = getNonEmptyInput(scanner,
                "What do you currently believe about this decision? ");

        String reason = getNonEmptyInput(scanner,
                "Why do you currently think this way? ");

        String benefits = getNonEmptyInput(scanner,
                "What are the main benefits of your current choice? ");

        String drawbacks = getNonEmptyInput(scanner,
                "What are the main drawbacks? ");

        String alternatives = getNonEmptyInput(scanner,
                "What alternatives have you considered? ");

        String evidence = getNonEmptyInput(scanner,
                "What evidence or information supports your thinking? ");

        String overlooked = getNonEmptyInput(scanner,
                "What might you be overlooking? ");

        String finalDecision = getNonEmptyInput(scanner,
                "After thinking through these points, what is your final decision? ");

        String changed = getYesNoInput(scanner,
                "Did your thinking change during this process? (yes/no) ");

        return new DecisionSession(
                decision,
                initialBelief,
                reason,
                benefits,
                drawbacks,
                alternatives,
                evidence,
                overlooked,
                finalDecision,
                changed
        );
    }

    private String getNonEmptyInput(Scanner scanner, String question) {

        while (true) {

            System.out.print(question);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("Input cannot be empty. Please try again.");
        }
    }

    private String getYesNoInput(Scanner scanner, String question) {

        while (true) {

            System.out.print(question);

            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("yes") || input.equals("no")) {
                return input;
            }

            System.out.println("Please enter only 'yes' or 'no'.");
        }
    }
}
