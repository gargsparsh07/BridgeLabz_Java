package CoreProgramming.ObjectOrientedDesignPrinciples.AssistedProblems;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    public static void main(String[] args) {
        Company c = new Company("Infosys");
        Department d = new Department("IT");
        d.employees.add(new Employee("Ravi"));
        c.departments.add(d);

        System.out.println("Company created with departments and employees");
    }
}
