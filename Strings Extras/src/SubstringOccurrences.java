import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the substring to search: ");
        String subString = scanner.nextLine();

        int count = countOccurrences(mainString, subString);
        System.out.println("Occurrences of \"" + subString + "\": " + count);
    }

    public static int countOccurrences(String main, String sub) {
        int count = 0;
        int index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // move past the current match
        }

        return count;
    }
}
