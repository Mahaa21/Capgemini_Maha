import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int len = input.length();
        int mid = len / 2;
        String result = "";
        for (int i = 0; i < mid; i++) {
            result += Character.toUpperCase(input.charAt(i));
        }
        for (int i = mid; i < len; i++) {
            result += Character.toLowerCase(input.charAt(i));
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
