import java.util.Scanner;

public class TextToLowerCase{
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); 
            }
            
            result.append(ch);
        }
        
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
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

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
		
		String builtInLowerCase = userInput.toLowerCase();
		String manualLowerCase = manualToLowerCase(userInput);

        boolean areEqual = compareStrings(builtInLowerCase, manualLowerCase);

        System.out.println("\nOriginal Text: " + userInput);
        System.out.println("Built-in toLowerCase(): " + builtInLowerCase);
        System.out.println("Manual Conversion: " + manualLowerCase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
