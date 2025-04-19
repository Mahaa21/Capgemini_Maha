import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateArithmetic {
    public static LocalDate manipulateDate(LocalDate date) {
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = addedDate.minusWeeks(3);
        return finalDate;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter =       DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();
        try {
            LocalDate inputDate = LocalDate.parse(input, formatter);
            LocalDate resultDate = manipulateDate(inputDate);
            System.out.println("\nOriginal Date 	: " + inputDate);
            System.out.println("Final Date Result : " + resultDate);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }
}
