import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 99; i >= 1; i--) {
                if (i % number == 0) { // Check if 'i' is a multiple of 'number'
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}
