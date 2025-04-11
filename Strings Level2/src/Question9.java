import java.util.Scanner;

public class Question9 {
    public static void countCategories(String str) {
        int digits = 0, upper = 0, lower = 0, special = 0;
        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) digits++;
                else if (Character.isUpperCase(ch)) upper++;
                else if (Character.isLowerCase(ch)) lower++;
                else special++;
                i++;
            }
        } catch (IndexOutOfBoundsException ignored) {}

        System.out.println("Digits: " + digits);
        System.out.println("Uppercase Letters: " + upper);
        System.out.println("Lowercase Letters: " + lower);
        System.out.println("Special Characters: " + special);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        countCategories(input);
        scanner.close();
    }
}
