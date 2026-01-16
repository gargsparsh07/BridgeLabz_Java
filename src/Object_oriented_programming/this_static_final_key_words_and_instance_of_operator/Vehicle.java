package Object_oriented_programming.this_static_final_key_words_and_instance_of_operator;

class Vehicle {
    static double registrationFee = 5000;

    String ownerName, vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {
        System.out.println(ownerName + " | " + vehicleType + " | " + registrationNumber);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Suresh", "Car", "TN09AB1234");

        if (v instanceof Vehicle) {
            v.display();
        }

        Vehicle.updateRegistrationFee(6000);
        System.out.println("Fee: " + registrationFee);
    }
}
