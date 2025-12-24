package CoreProgramming.JavaConstructorsInstancevsClassVariablesAccessModifiers.level1;

import java.util.Scanner;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    Circle(double r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        c.display();
    }
}
