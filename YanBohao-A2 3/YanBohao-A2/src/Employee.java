public class Employee extends Person {
    private String position;
    private int experienceYears;

    public Employee() {}

    public Employee(String name, int age, String position, int experienceYears) {
        super(name, age);
        this.position = position;
        this.experienceYears = experienceYears;
    }

    // Getters and setters
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }
}