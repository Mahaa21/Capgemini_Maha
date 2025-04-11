import java.util.Scanner;

public class Question5 {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Out of bounds
    }

    public static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length())); // Exception here
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Uncomment to see crash
        // generateException(input);

        handleException(input);
    }
}
