import java.util.Scanner;

public class Question9 {
    public static String toUpperCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manual = toUpperCaseCustom(input);
        String builtin = input.toUpperCase();

        System.out.println("Custom Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtin);
        System.out.println("Match: " + compareStrings(manual, builtin));
    }
}
