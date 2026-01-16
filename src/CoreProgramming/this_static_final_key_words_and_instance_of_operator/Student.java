package CoreProgramming.this_static_final_key_words_and_instance_of_operator;

class Student {
    static String universityName = "Anna University";
    static int totalStudents = 0;

    String name, grade;
    final int rollNumber;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        System.out.println(name + " - Roll: " + rollNumber + " - Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student("Karan", 21, "A");

        if (s instanceof Student) {
            s.display();
        }

        Student.displayTotalStudents();
    }
}
