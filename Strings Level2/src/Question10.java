import java.util.Scanner;

public class Question10 {
    public static int countOccurrences(String str, char target) {
        int count = 0;
        int i = 0;
        try {
            while (true) {
                if (str.charAt(i) == target) {
                    count++;
                }
                i++;
            }
        } catch (IndexOutOfBoundsException ignored) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int result = countOccurrences(input, ch);
        System.out.println("Character '" + ch + "' is repeated " + result + " times.");
        scanner.close();
    }
}
