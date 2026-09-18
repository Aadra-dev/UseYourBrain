package service;

import java.util.Scanner;
import model.BrainstormSession;

public class BrainstormService {

    public BrainstormSession startBrainstormSession(Scanner scanner) {

        System.out.println("\n=================================");
        System.out.println("         BRAINSTORM MODE");
        System.out.println("=================================");

        String topic = getNonEmptyInput(
                scanner,
                "\nWhat problem or topic do you want to brainstorm? "
        );

        String existingKnowledge = getNonEmptyInput(
                scanner,
                "What do you already know about it? "
        );

        String ideas = getNonEmptyInput(
                scanner,
                "What ideas can you generate on your own? "
        );

        String constraints = getNonEmptyInput(
                scanner,
                "What constraints or limitations do you have? "
        );

        String feasibleIdeas = getNonEmptyInput(
                scanner,
                "Which of your ideas seem realistically feasible? "
        );

        String chosenDirection = getNonEmptyInput(
                scanner,
                "Which direction do you want to explore further? "
        );

        return new BrainstormSession(
                topic,
                existingKnowledge,
                ideas,
                constraints,
                feasibleIdeas,
                chosenDirection
        );
    }

    private String getNonEmptyInput(
            Scanner scanner,
            String question) {

        while (true) {

            System.out.print(question);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(
                    "Input cannot be empty. Please try again."
            );
        }
    }
}
