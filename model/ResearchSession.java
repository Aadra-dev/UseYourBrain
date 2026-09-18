package model;

public class ResearchSession {

    private String researchQuestion;
    private String existingBelief;
    private String sources;
    private String supportingEvidence;
    private String challengingEvidence;
    private String conclusion;

    public ResearchSession(
            String researchQuestion,
            String existingBelief,
            String sources,
            String supportingEvidence,
            String challengingEvidence,
            String conclusion) {

        this.researchQuestion = researchQuestion;
        this.existingBelief = existingBelief;
        this.sources = sources;
        this.supportingEvidence = supportingEvidence;
        this.challengingEvidence = challengingEvidence;
        this.conclusion = conclusion;
    }

    public String getResearchQuestion() {
        return researchQuestion;
    }

    public String getExistingBelief() {
        return existingBelief;
    }

    public String getSources() {
        return sources;
    }

    public String getSupportingEvidence() {
        return supportingEvidence;
    }

    public String getChallengingEvidence() {
        return challengingEvidence;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void displaySummary() {

        System.out.println("\n========================================");
        System.out.println("          RESEARCH SUMMARY");
        System.out.println("========================================");

        System.out.println("\nResearch Question:");
        System.out.println(researchQuestion);

        System.out.println("\nWhat I Already Think:");
        System.out.println(existingBelief);

        System.out.println("\nSources / Research:");
        System.out.println(sources);

        System.out.println("\nSupporting Evidence:");
        System.out.println(supportingEvidence);

        System.out.println("\nChallenging Evidence:");
        System.out.println(challengingEvidence);

        System.out.println("\nMy Conclusion:");
        System.out.println(conclusion);

        System.out.println("\n========================================");
    }
}
