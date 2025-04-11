import java.util.Scanner;

public class Question5 {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException ignored) {}

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        String output = reverse(input);
        System.out.println("Reversed string: " + output);
        scanner.close();
    }
}
