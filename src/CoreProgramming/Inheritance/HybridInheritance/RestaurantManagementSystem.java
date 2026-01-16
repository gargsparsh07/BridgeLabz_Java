package CoreProgramming.Inheritance.HybridInheritance;

// Superclass
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Subclass Chef
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking meals.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " is serving customers.");
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Worker chef = new Chef("Rohit", 101);
        Worker waiter = new Waiter("Amit", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
