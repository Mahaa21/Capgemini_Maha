import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("Modified String (No Duplicates): " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // Assumes ASCII characters

        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true;
            }
        }

        return result.toString();
    }
}
