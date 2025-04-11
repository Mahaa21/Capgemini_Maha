import java.util.Scanner;

public class StrIdxOutOfBndsExcep {
    public static void generateException(String text) {
        System.out.println("Attempting to access an out-of-bounds index...");
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length())); 
    }

    public static void handleException(String text) {
        try {
            System.out.println("Attempting to access an out-of-bounds index...");
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
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
