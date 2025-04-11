import java.util.Scanner;

public class SubStringComparison {
    
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i); 
        }
        return result;
    }
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.next();
        
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();
        String charAtSubstring = substringUsingCharAt(originalString, startIndex, endIndex);
        String builtInSubstring = originalString.substring(startIndex, endIndex);
		boolean comparisonResult = compareUsingCharAt(charAtSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring() method: " + builtInSubstring);
        System.out.println("Comparison result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both methods produce the same substring.");
        } else {
            System.out.println("The substrings do not match.");
        }
        scanner.close();
    }
}
