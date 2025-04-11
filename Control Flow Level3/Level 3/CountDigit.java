import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        int count = 0;
        int originalNumber = number;  
        if (number == 0) {
            count = 1; 
        } else {
            while (number != 0) {
                number /= 10; 
                count++; 
            }
        }
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}
