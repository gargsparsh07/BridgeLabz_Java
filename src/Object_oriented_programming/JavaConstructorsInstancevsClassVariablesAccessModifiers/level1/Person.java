package Object_oriented_programming.JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        System.out.println("Original Person");
        Person p1 = new Person("Pankaj", 21);
        p1.display();

        System.out.println("\nCloned Person (Copy Constructor)");
        Person p2 = new Person(p1);
        p2.display();
    }
}
