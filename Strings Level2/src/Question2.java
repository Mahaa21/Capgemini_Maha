import java.util.Scanner;

public class Question2 {
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }
        return subStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String originalString = scanner.next();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        String subStrCharAt = substringUsingCharAt(originalString, startIndex, endIndex);
        String subStrMethod = originalString.substring(startIndex, endIndex);

        System.out.println("Substring using charAt(): " + subStrCharAt);
        System.out.println("Substring using substring(): " + subStrMethod);

        if (subStrCharAt.equals(subStrMethod)) {
            System.out.println("Both substrings are identical.");
        } else {
            System.out.println("Substrings are different.");
        }
    }
}
