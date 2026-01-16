package Object_oriented_programming.JavaClassAndObject.level1;

import java.util.Scanner;

class Circle {
    double radius;

    void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    void calculateCircumference() {
        System.out.println("Circumference of Circle: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of Circle");
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle();
        c.radius = r;

        c.calculateArea();
        c.calculateCircumference();
    }
}
