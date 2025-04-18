import java.util.Scanner;
public class PowerCalc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power (non-negative integer): ");
        int power = scanner.nextInt();
        if (power < 0) {
            System.out.println("Power should be a non-negative integer.");
        } else {
            int result = 1; 
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++; 
            }
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        scanner.close();
    }
}
