import java.util.Scanner;

public class Question10 {
    public static String toLowerCaseCustom(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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

        String manual = toLowerCaseCustom(input);
        String builtin = input.toLowerCase();

        System.out.println("Custom Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtin);
        System.out.println("Match: " + compareStrings(manual, builtin));
    }
}
