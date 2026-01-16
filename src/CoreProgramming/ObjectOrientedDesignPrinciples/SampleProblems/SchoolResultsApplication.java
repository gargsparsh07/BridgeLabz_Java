package CoreProgramming.ObjectOrientedDesignPrinciples.SampleProblems;

import java.util.ArrayList;

// Subject class
class ResultSubject {
    String subjectName;
    int marks;

    ResultSubject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
}

// Student class
class ResultStudent {
    String name;
    ArrayList<ResultSubject> subjects = new ArrayList<>();

    ResultStudent(String name) {
        this.name = name;
    }

    void addSubject(ResultSubject s) {
        subjects.add(s);
    }

    void requestGrade(ResultGradeCalculator gc) {
        gc.calculateGrade(this);
    }
}

// GradeCalculator class
class ResultGradeCalculator {

    void calculateGrade(ResultStudent student) {
        int total = 0;

        for (ResultSubject s : student.subjects) {
            total += s.marks;
        }

        int avg = total / student.subjects.size();

        System.out.println("Student: " + student.name);
        System.out.println("Average Marks: " + avg);

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

// Main class
public class SchoolResultsApplication {
    public static void main(String[] args) {

        ResultStudent student = new ResultStudent("John");

        ResultSubject s1 = new ResultSubject("Maths", 90);
        ResultSubject s2 = new ResultSubject("Science", 85);

        student.addSubject(s1);
        student.addSubject(s2);

        ResultGradeCalculator calculator = new ResultGradeCalculator();
        student.requestGrade(calculator);
    }
}
