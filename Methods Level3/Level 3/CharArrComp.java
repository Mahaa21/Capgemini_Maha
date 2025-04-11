import java.util.Scanner;

public class CharArrComp{
    public static char[] getCharsManually(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i); 
        }
        return charArray;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        char[] manualCharArray = getCharsManually(inputString);
        char[] builtInCharArray = inputString.toCharArray();
        boolean comparisonResult = compareCharArrays(manualCharArray, builtInCharArray);

        System.out.println("Character array using user-defined method: " + new String(manualCharArray));
        System.out.println("Character array using toCharArray() method: " + new String(builtInCharArray));
        System.out.println("Comparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both methods produce the same character array.");
        } else {
            System.out.println("The character arrays do not match.");
        }

        scanner.close();
    }
}
