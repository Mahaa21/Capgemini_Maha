import java.util.Scanner;

public class Question7 {
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // Throws exception if text is not a number
        System.out.println("Number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String input = sc.next();

        // generateException(input); // Uncomment to crash

        handleException(input);
    }
}
