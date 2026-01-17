package Object_oriented_programming.ObjectOrientedDesignPrinciples.SelfProblems;

import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    Department(String deptName) {
        this.deptName = deptName;
    }
}

class University {
    String uniName;
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    public static void main(String[] args) {
        University u = new University("Anna University");
        u.departments.add(new Department("CSE"));
        u.faculties.add(new Faculty("Dr. Kumar"));

        System.out.println("University created");
    }
}
