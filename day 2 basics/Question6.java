import java.util.Scanner;
public class Question6 {

    public static void Exception(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void IllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("\nIllegalArgumentException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("\nRuntimeException caught: " + e.getMessage());
        }
    }


    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();
        Exception(text);
        IllegalArgumentException(text);
    }
}
