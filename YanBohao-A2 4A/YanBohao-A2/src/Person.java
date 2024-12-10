public abstract class Person {
    private String name;
    private int age;
    private String uniqueId;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.uniqueId = generateUniqueId();
    }

    private String generateUniqueId() {
        return name.substring(0, 2).toUpperCase() + String.format("%04d", (int)(Math.random() * 10000));
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getUniqueId() { return uniqueId; }
}