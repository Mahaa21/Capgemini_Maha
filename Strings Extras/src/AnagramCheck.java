import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both arrays
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        // Compare the sorted arrays
        return java.util.Arrays.equals(arr1, arr2);
    }
}
