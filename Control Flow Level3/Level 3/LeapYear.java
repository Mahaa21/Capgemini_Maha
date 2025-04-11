import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("Invalid year! Please enter a year from 1582 onwards.");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("(Logical Approach) " + year + " is a Leap Year.");
            } else {
                System.out.println("(Logical Approach) " + year + " is NOT a Leap Year.");
            }
        }
    }
}
