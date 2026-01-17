package Object_oriented_programming.ObjectOrientedDesignPrinciples.SelfProblems;

import java.util.*;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.students.add(this);
    }
}

class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    public static void main(String[] args) {
        School s = new School("DPS");
        Student st = new Student("Rahul");
        Course c1 = new Course("Math");

        st.enroll(c1);
        s.students.add(st);

        System.out.println(st.name + " enrolled in " + c1.courseName);
    }
}
