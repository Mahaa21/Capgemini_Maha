import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char mostFrequent = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static char findMostFrequentChar(String str) {
        int[] frequency = new int[256]; // Assuming ASCII characters

        for (char ch : str.toCharArray()) {
            frequency[ch]++;
        }

        int max = 0;
        char result = ' ';

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) {
                max = frequency[i];
                result = (char) i;
            }
        }

        return result;
    }
}
