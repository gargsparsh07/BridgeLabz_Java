package CoreProgramming.BuiltInFunction.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current Date in Different Formats:\n");
        System.out.println("dd/MM/yyyy       : " + today.format(format1));
        System.out.println("yyyy-MM-dd       : " + today.format(format2));
        System.out.println("EEE, MMM dd, yyyy: " + today.format(format3));
    }
}
