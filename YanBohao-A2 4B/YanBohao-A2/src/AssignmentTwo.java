import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {
    private List<Ride> rides;
    private List<Employee> employees;
    private List<Visitor> visitors;

    public AssignmentTwo() {
        this.rides = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.visitors = new ArrayList<>();
    }

    public static void main(String[] args) {
        AssignmentTwo park = new AssignmentTwo();

        // Create rides
        Ride rollerCoaster = new Ride("Thunderbolt", 12, 50, 3);
        Ride ferrisWheel = new Ride("Sky View", 5, 20, 1);
        Ride waterSlide = new Ride("Splash Mountain", 8, 30, 2);

        park.addRide(rollerCoaster);
        park.addRide(ferrisWheel);
        park.addRide(waterSlide);

        // Hire employees
        Employee john = new Employee("John", 30, "Ride Operator", 5);
        Employee sarah = new Employee("Sarah", 25, "Ride Operator", 2);

        park.hireEmployee(john);
        park.hireEmployee(sarah);

        // Assign operators to rides
        rollerCoaster.assignOperator(john);
        ferrisWheel.assignOperator(sarah);

        // Admit visitors
        Visitor alice = new Visitor("Alice", 15, true);
        Visitor bob = new Visitor("Bob", 10, true);
        Visitor charlie = new Visitor("Charlie", 20, false);
        Visitor dave = new Visitor("Dave", 12, true);
        Visitor eve = new Visitor("Eve", 8, false);

        park.admitVisitor(alice);
        park.admitVisitor(bob);
        park.admitVisitor(charlie);
        park.admitVisitor(dave);
        park.admitVisitor(eve);

        // Demonstrate partThree
      //  park.partThree();

        // Demonstrate partFourA
       // park.partFourA();

        // Demonstrate partFourB
        park.partFourB();
    }

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void admitVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void partThree() {
        System.out.println("\n--- Part Three ---");
        Ride rollerCoaster = rides.get(0);  // Assuming Thunderbolt is the first ride

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitors.get(0));  // Alice
        rollerCoaster.addVisitorToQueue(visitors.get(1));  // Bob
        rollerCoaster.addVisitorToQueue(visitors.get(2));  // Charlie
        rollerCoaster.addVisitorToQueue(visitors.get(3));  // Dave
        rollerCoaster.addVisitorToQueue(visitors.get(4));  // Eve

        System.out.println("Initial queue:");
        rollerCoaster.printQueue();

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue();

        System.out.println("\nQueue after removing one visitor:");
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        System.out.println("\n--- Part Four A ---");
        Ride ferrisWheel = rides.get(1);  // Assuming Sky View is the second ride

        // Add visitors to the history
        ferrisWheel.addVisitorToHistory(visitors.get(0));  // Alice
        ferrisWheel.addVisitorToHistory(visitors.get(1));  // Bob
        ferrisWheel.addVisitorToHistory(visitors.get(2));  // Charlie
        ferrisWheel.addVisitorToHistory(visitors.get(3));  // Dave
        ferrisWheel.addVisitorToHistory(visitors.get(4));  // Eve

        // Check if a visitor is in the history
        ferrisWheel.checkVisitorFromHistory(visitors.get(0));  // Alice
        ferrisWheel.checkVisitorFromHistory(visitors.get(2));  // Charlie

        // Print the number of visitors in the history
        ferrisWheel.numberOfVisitors();

        // Print all visitors in the history
        ferrisWheel.printRideHistory();
    }

    public void partFourB() {
        System.out.println("\n--- Part Four B ---");
        Ride waterSlide = rides.get(2);  // Assuming Splash Mountain is the third ride

        // Add visitors to the history
        waterSlide.addVisitorToHistory(visitors.get(0));  // Alice
        waterSlide.addVisitorToHistory(visitors.get(1));  // Bob
        waterSlide.addVisitorToHistory(visitors.get(2));  // Charlie
        waterSlide.addVisitorToHistory(visitors.get(3));  // Dave
        waterSlide.addVisitorToHistory(visitors.get(4));  // Eve

        // Print all visitors in the history before sorting
        System.out.println("Ride history before sorting:");
        waterSlide.printRideHistory();

        // Sort the collection
        waterSlide.sortRideHistory();

        // Print all visitors in the history after sorting
        System.out.println("Ride history after sorting:");
        waterSlide.printRideHistory();
    }

    public void partFive() {
        // Implementation for part five
    }

    public void partSix() {
        // Implementation for part six
    }

    public void partSeven() {
        // Implementation for part seven
    }
}