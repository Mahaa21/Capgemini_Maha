import java.util.Scanner;
import java.util.Arrays;

public class Question2 {
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

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] customSplit = splitIntoWords(input);
        String[] builtInSplit = input.split(" ");
        System.out.println("Custom split result: " + Arrays.toString(customSplit));
        System.out.println("Built-in split result: " + Arrays.toString(builtInSplit));
        System.out.println("Are both results equal? " + compareArrays(customSplit, builtInSplit));
        scanner.close();
    }
}
