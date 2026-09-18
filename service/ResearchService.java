package service;

import java.util.Scanner;
import model.ResearchSession;

public class ResearchService {

    public ResearchSession startResearchSession(Scanner scanner) {

        System.out.println("\n=================================");
        System.out.println("          RESEARCH MODE");
        System.out.println("=================================");

        String researchQuestion = getNonEmptyInput(
                scanner,
                "\nWhat do you want to research? "
        );

        String existingBelief = getNonEmptyInput(
                scanner,
                "What do you already believe about this topic? "
        );

        String sources = getNonEmptyInput(
                scanner,
                "What sources did you research? "
        );

        String supportingEvidence = getNonEmptyInput(
                scanner,
                "What evidence supports your initial belief? "
        );

        String challengingEvidence = getNonEmptyInput(
                scanner,
                "What evidence challenges your initial belief? "
        );

        String conclusion = getNonEmptyInput(
                scanner,
                "After researching, what is your conclusion? "
        );

        return new ResearchSession(
                researchQuestion,
                existingBelief,
                sources,
                supportingEvidence,
                challengingEvidence,
                conclusion
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