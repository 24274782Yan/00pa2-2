import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class Ride implements RideInterface {
    private String name;
    private int minimumAge;
    private int energyRequirement;
    private int minimumExperienceRequired;
    private Employee currentOperator;
    private boolean isOperational;
    private Queue<Visitor> visitorQueue;
    private List<Visitor> rideHistory;

    public Ride() {}

    public Ride(String name, int minimumAge, int energyRequirement, int minimumExperienceRequired) {
        this.name = name;
        this.minimumAge = minimumAge;
        this.energyRequirement = energyRequirement;
        this.minimumExperienceRequired = minimumExperienceRequired;
        this.isOperational = false;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public void assignOperator(Employee employee) {
        if (employee.getExperienceYears() >= minimumExperienceRequired) {
            this.currentOperator = employee;
            this.isOperational = true;
        } else {
            System.out.println(employee.getName() + " is not qualified to operate " + this.name);
        }
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.offer(visitor);
        System.out.println(visitor.getName() + " added to the queue for " + name);
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = visitorQueue.poll();
        if (removedVisitor != null) {
            System.out.println(removedVisitor.getName() + " removed from the queue for " + name);
        } else {
            System.out.println("Queue is empty for " + name);
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in queue for " + name + ":");
        for (Visitor visitor : visitorQueue) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (isOperational && !visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll();
            addVisitorToHistory(visitor);
            System.out.println(visitor.getName() + " has ridden " + name);
        } else {
            System.out.println(name + " cannot run a cycle at this time.");
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " added to the ride history for " + name);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.println(visitor.getName() + " is " + (found ? "" : "not ") + "in the ride history for " + name);
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println("Number of visitors in the ride history for " + name + ": " + count);
        return count;
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride history for " + name + ":");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history for " + name + " has been sorted.");
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getMinimumAge() { return minimumAge; }
    public void setMinimumAge(int minimumAge) { this.minimumAge = minimumAge; }
    public int getEnergyRequirement() { return energyRequirement; }
    public void setEnergyRequirement(int energyRequirement) { this.energyRequirement = energyRequirement; }
    public int getMinimumExperienceRequired() { return minimumExperienceRequired; }
    public void setMinimumExperienceRequired(int minimumExperienceRequired) { this.minimumExperienceRequired = minimumExperienceRequired; }
    public Employee getCurrentOperator() { return currentOperator; }
    public void setCurrentOperator(Employee currentOperator) { this.currentOperator = currentOperator; }
    public boolean isOperational() { return isOperational; }
    public void setOperational(boolean operational) { isOperational = operational; }
}