package CoreProgramming.ObjectOrientedDesignPrinciples.SelfProblems;

class UniCourse {
    String courseName;

    UniCourse(String courseName) {
        this.courseName = courseName;
    }
}

class UniProfessor {
    String name;

    UniProfessor(String name) {
        this.name = name;
    }

    void assignProfessor(UniCourse c) {
        System.out.println(name + " teaches " + c.courseName);
    }
}

class UniStudent {
    String name;

    UniStudent(String name) {
        this.name = name;
    }

    void enrollCourse(UniCourse c) {
        System.out.println(name + " enrolled in " + c.courseName);
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        UniCourse c = new UniCourse("Java");
        UniStudent s = new UniStudent("Rahul");
        UniProfessor p = new UniProfessor("Dr. Rao");

        s.enrollCourse(c);
        p.assignProfessor(c);
    }
}
