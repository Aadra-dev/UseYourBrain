package model;

public class BrainstormSession implements Session {

    private String topic;
    private String existingKnowledge;
    private String ideas;
    private String constraints;
    private String feasibleIdeas;
    private String chosenDirection;

    public BrainstormSession(
            String topic,
            String existingKnowledge,
            String ideas,
            String constraints,
            String feasibleIdeas,
            String chosenDirection) {

        this.topic = topic;
        this.existingKnowledge = existingKnowledge;
        this.ideas = ideas;
        this.constraints = constraints;
        this.feasibleIdeas = feasibleIdeas;
        this.chosenDirection = chosenDirection;
    }

    public String getTopic() {
        return topic;
    }

    public String getExistingKnowledge() {
        return existingKnowledge;
    }

    public String getIdeas() {
        return ideas;
    }

    public String getConstraints() {
        return constraints;
    }

    public String getFeasibleIdeas() {
        return feasibleIdeas;
    }

    public String getChosenDirection() {
        return chosenDirection;
    }

    @Override
    public String getSessionType() {
        return "Brainstorm Mode";
    }

    @Override
    public String getSummary() {
        return "Topic / Problem: " + topic
            + "\nExisting Knowledge: " + existingKnowledge
            + "\nIdeas Generated: " + ideas
            + "\nConstraints: " + constraints
            + "\nFeasible Ideas: " + feasibleIdeas
            + "\nChosen Direction: " + chosenDirection;
    }
    
    public void displaySummary() {

        System.out.println("\n========================================");
        System.out.println("          BRAINSTORM SUMMARY");
        System.out.println("========================================");

        System.out.println("\nTopic / Problem:");
        System.out.println(topic);

        System.out.println("\nWhat I Already Know:");
        System.out.println(existingKnowledge);

        System.out.println("\nIdeas Generated:");
        System.out.println(ideas);

        System.out.println("\nConstraints:");
        System.out.println(constraints);

        System.out.println("\nFeasible Ideas:");
        System.out.println(feasibleIdeas);

        System.out.println("\nChosen Direction:");
        System.out.println(chosenDirection);

        System.out.println("\n========================================");
    }
}
