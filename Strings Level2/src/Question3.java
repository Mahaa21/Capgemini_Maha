import java.util.Scanner;

public class Question3 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates we've reached the end of the string
        }
        return count;
    }

    public static String[] splitIntoWords(String str) {
        int length = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = (i < spaceCount) ? spaceIndexes[i] : length;
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }

    public static String[][] wordsWithLengths(String[] words) {
        int numWords = words.length;
        String[][] result = new String[numWords][2];
        for (int i = 0; i < numWords; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void displayWordLengths(String[][] wordLengths) {
        System.out.printf("%-15s%-10s%n", "Word", "Length");
        System.out.println("------------------------------");
        for (String[] wordLength : wordLengths) {
            System.out.printf("%-15s%-10s%n", wordLength[0], wordLength[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = splitIntoWords(input);
        String[][] wordLengths = wordsWithLengths(words);
        displayWordLengths(wordLengths);
        scanner.close();
    }
}
