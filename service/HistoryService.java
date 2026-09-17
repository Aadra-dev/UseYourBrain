package service;

import java.util.ArrayList;
import java.util.List;
import model.DecisionSession;

public class HistoryService {

    private List<DecisionSession> decisionHistory;

    public HistoryService() {
        decisionHistory = new ArrayList<>();
    }

    public void addSession(DecisionSession session) {
        decisionHistory.add(session);
    }

    public int getSessionCount() {
        return decisionHistory.size();
    }

    public void displayHistory() {

    System.out.println("\n========================================");
    System.out.println("        REFLECTION & HISTORY");
    System.out.println("========================================");

        if (decisionHistory.isEmpty()) {
            System.out.println("\nNo decision sessions found.");
            System.out.println("Complete a Decision Mode session first.");
            return;
        }

        System.out.println("\nTotal sessions: " + decisionHistory.size());

        for (int i = 0; i < decisionHistory.size(); i++) {

            DecisionSession session = decisionHistory.get(i);

    System.out.println("\n----------------------------------------");
        System.out.println("Session " + (i + 1));
    System.out.println("----------------------------------------");

            System.out.println("Decision: " + session.getDecision());
            System.out.println("Initial belief: " + session.getInitialBelief());
            System.out.println("Final decision: " + session.getFinalDecision());
            System.out.println("Thinking changed: " + session.getThinkingChanged());
        }

    System.out.println("\n========================================");
    }
}
