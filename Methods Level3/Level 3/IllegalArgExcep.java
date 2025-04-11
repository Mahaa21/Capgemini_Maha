import java.util.Scanner;

public class IllegalArgExcep {
    public static void generateException(String text, int start, int end) {
        System.out.println("Attempting to create a substring with start index greater than end index...");
        String result = text.substring(start, end); 
        System.out.println("Generated substring: " + result);
    }
    public static void handleException(String text, int start, int end) {
        try {
            System.out.println("Attempting to create a substring with start index greater than end index...");
            String result = text.substring(start, end);
            System.out.println("Generated substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("A general exception occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.next(); 

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        System.out.println("Press 1 to generate exception or 2 to handle exception: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            generateException(userInput, startIndex, endIndex); 
        } else if (choice == 2) {
            handleException(userInput, startIndex, endIndex); 
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
