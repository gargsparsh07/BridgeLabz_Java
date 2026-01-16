package CoreProgramming.this_static_final_key_words_and_instance_of_operator;

class Employee {
    static String companyName = "Infosys";
    static int totalEmployees = 0;

    String name, designation;
    final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        System.out.println(name + " - " + designation + " - ID: " + id);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Amit", 1, "Developer");

        if (e instanceof Employee) {
            e.display();
        }

        Employee.displayTotalEmployees();
    }
}
