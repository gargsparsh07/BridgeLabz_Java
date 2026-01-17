package Object_oriented_programming.this_static_final_key_words_and_instance_of_operator;

class Patient {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    String name, ailment;
    int age;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display() {
        System.out.println(name + " | " + ailment + " | ID: " + patientID);
    }

    public static void main(String[] args) {
        Patient p = new Patient("Ramesh", 45, "Fever", 501);

        if (p instanceof Patient) {
            p.display();
        }

        Patient.getTotalPatients();
    }
}
