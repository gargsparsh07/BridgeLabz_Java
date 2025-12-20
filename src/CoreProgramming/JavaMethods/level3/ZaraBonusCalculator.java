package CoreProgramming.JavaMethods.level3;

public class ZaraBonusCalculator {

    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2]; // salary, years

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // salary
            data[i][1] = (int)(Math.random() * 10) + 1;       // years
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];

            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void display(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("OldSalary\tBonus\t\tNewSalary");
        for (double[] r : result) {
            System.out.println(r[0] + "\t\t" + r[1] + "\t\t" + r[2]);
            totalOld += r[0];
            totalBonus += r[1];
            totalNew += r[2];
        }

        System.out.println("\nTotal Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        double[][] employees = generateEmployeeData(10);
        double[][] result = calculateBonus(employees);
        display(result);
    }
}
