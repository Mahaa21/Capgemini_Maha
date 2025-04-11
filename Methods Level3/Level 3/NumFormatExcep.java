import java.util.Scanner;

public class NumFormatExcep{
    public static void generateException(String text) {
        System.out.println("Attempting to convert input to an integer...");
        int number = Integer.parseInt(text); // This will throw NumberFormatException if the text is not a number
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            System.out.println("Attempting to convert input to an integer...");
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A general exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String userInput = scanner.next(); 

        System.out.println("Press 1 to generate exception or 2 to handle exception: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            generateException(userInput); 
        } else if (choice == 2) {
            handleException(userInput); 
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
