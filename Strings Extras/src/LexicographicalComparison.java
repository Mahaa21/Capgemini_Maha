import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    public static int compareStrings(String s1, String s2) {
        int minLen = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }

        // If one string is a prefix of the other
        return s1.length() - s2.length();
    }
}
