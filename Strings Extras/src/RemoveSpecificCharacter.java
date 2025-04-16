import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String result = removeCharacter(input, charToRemove);
        System.out.println("Modified String: " + result);
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder modifiedString = new StringBuilder();

        for (char currentChar : str.toCharArray()) {
            if (currentChar != ch) {
                modifiedString.append(currentChar);
            }
        }

        return modifiedString.toString();
    }
}
