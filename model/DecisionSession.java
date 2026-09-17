package model;

public class DecisionSession {

    private String decision;
    private String initialBelief;
    private String reason;
    private String benefits;
    private String drawbacks;
    private String alternatives;
    private String evidence;
    private String overlooked;
    private String finalDecision;
    private String thinkingChanged;

    public DecisionSession(
            String decision,
            String initialBelief,
            String reason,
            String benefits,
            String drawbacks,
            String alternatives,
            String evidence,
            String overlooked,
            String finalDecision,
            String thinkingChanged) {

        this.decision = decision;
        this.initialBelief = initialBelief;
        this.reason = reason;
        this.benefits = benefits;
        this.drawbacks = drawbacks;
        this.alternatives = alternatives;
        this.evidence = evidence;
        this.overlooked = overlooked;
        this.finalDecision = finalDecision;
        this.thinkingChanged = thinkingChanged;
    }

    public String getDecision() {
        return decision;
    }

    public String getInitialBelief() {
        return initialBelief;
    }

    public String getReason() {
        return reason;
    }

    public String getBenefits() {
        return benefits;
    }

    public String getDrawbacks() {
        return drawbacks;
    }

    public String getAlternatives() {
        return alternatives;
    }

    public String getEvidence() {
        return evidence;
    }

    public String getOverlooked() {
        return overlooked;
    }

    public String getFinalDecision() {
        return finalDecision;
    }

    public String getThinkingChanged() {
        return thinkingChanged;
    }

    public void displaySummary() {

    System.out.println("\n========================================");
    System.out.println("          YOUR DECISION SUMMARY");
    System.out.println("========================================");

        System.out.println("\nDecision:");
        System.out.println(decision);

        System.out.println("\nInitial belief:");
        System.out.println(initialBelief);

        System.out.println("\nReasoning:");
        System.out.println(reason);

        System.out.println("\nBenefits:");
        System.out.println(benefits);

        System.out.println("\nDrawbacks:");
        System.out.println(drawbacks);

        System.out.println("\nAlternatives:");
        System.out.println(alternatives);

        System.out.println("\nEvidence:");
        System.out.println(evidence);

        System.out.println("\nPotential blind spot:");
        System.out.println(overlooked);

        System.out.println("\nFinal decision:");
        System.out.println(finalDecision);

        System.out.println("\nDid your thinking change?");
        System.out.println(thinkingChanged);

    System.out.println("\n========================================");
    }
}