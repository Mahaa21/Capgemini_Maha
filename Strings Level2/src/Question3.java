import java.util.Scanner;
import java.util.Arrays;

public class Question3 {
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] manualArray = getCharsUsingCharAt(input);
        char[] methodArray = input.toCharArray();

        System.out.println("Characters using charAt(): " + Arrays.toString(manualArray));
        System.out.println("Characters using toCharArray(): " + Arrays.toString(methodArray));

        if (Arrays.equals(manualArray, methodArray)) {
            System.out.println("Both arrays are identical.");
        } else {
            System.out.println("Arrays are different.");
        }
    }
}
