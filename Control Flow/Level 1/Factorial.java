import java.math.BigInteger;
import java.util.Scanner;
class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger factorial = BigInteger.ONE;
            int i = 1;
            while (i <= number) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
                i++;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
