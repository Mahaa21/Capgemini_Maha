import java.util.Scanner;
class SumNatural{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both computations match. The result is correct!");
            } else {
                System.out.println("There is a mismatch. Please check the calculations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
