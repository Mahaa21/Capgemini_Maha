import java.util.Scanner;
public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n > 0): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a positive natural number.");
            scanner.close();
            return;
        }
        int sumRecursive = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are equal. The computation is correct!");
        } else {
            System.out.println("There is a mismatch in the computation.");
        }
    }
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }
    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
