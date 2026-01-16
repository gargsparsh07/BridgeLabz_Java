package CoreProgramming.Encapsulation_Polymorphism_Interface_and_Abstract_Class;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    protected String name;
    public Patient(String name) { this.name = name; }
    public abstract double calculateBill();
}

class InPatient extends Patient {
    public InPatient(String n) { super(n); }
    public double calculateBill() { return 5000; }
}

class OutPatient extends Patient {
    public OutPatient(String n) { super(n); }
    public double calculateBill() { return 800; }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p = new InPatient("Ravi");
        System.out.println("Bill: ₹" + p.calculateBill());
    }
}
