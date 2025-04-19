import java.util.Scanner;
public class FactorialRecursion {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1);
    }
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
    public static void main(String[] args) {
        int input = getInput();
        if (input < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = factorial(input);
            displayResult(input, fact);
        }
    }
}
