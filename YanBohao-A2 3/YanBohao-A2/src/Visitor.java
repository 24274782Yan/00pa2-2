public class Visitor extends Person {
    private boolean hasPass;
    private int happinessLevel;

    public Visitor() {}

    public Visitor(String name, int age, boolean hasPass) {
        super(name, age);
        this.hasPass = hasPass;
        this.happinessLevel = 50;
    }

    // Getters and setters
    public boolean isHasPass() { return hasPass; }
    public void setHasPass(boolean hasPass) { this.hasPass = hasPass; }
    public int getHappinessLevel() { return happinessLevel; }
    public void setHappinessLevel(int happinessLevel) { this.happinessLevel = happinessLevel; }
}