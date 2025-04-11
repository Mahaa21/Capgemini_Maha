import java.util.ArrayList;
import java.util.Scanner;

public class Question7{
    public static char[] getVowels(String str) {
        ArrayList<Character> vowels = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels.add(ch);
                }
                i++;
            }
        } catch (IndexOutOfBoundsException ignored) {}

        char[] result = new char[vowels.size()];
        for (int j = 0; j < vowels.size(); j++) {
            result[j] = vowels.get(j);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] vowels = getVowels(input);
        System.out.print("Vowels in the string: ");
        for (char v : vowels) {
            System.out.print(v + " ");
        }
        scanner.close();
    }
}
