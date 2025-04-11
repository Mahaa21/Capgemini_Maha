import java.util.ArrayList;
import java.util.Scanner;

public class Question8 {
    public static char[] getConsonants(String str) {
        ArrayList<Character> consonants = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch) && "AEIOUaeiou".indexOf(ch) == -1) {
                    consonants.add(ch);
                }
                i++;
            }
        } catch (IndexOutOfBoundsException ignored) {}

        char[] result = new char[consonants.size()];
        for (int j = 0; j < consonants.size(); j++) {
            result[j] = consonants.get(j);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] consonants = getConsonants(input);
        System.out.print("Consonants in the string: ");
        for (char c : consonants) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
