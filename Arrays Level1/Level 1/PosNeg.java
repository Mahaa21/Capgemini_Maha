import java.util.Scanner;
public class PosNeg{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; 
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers) {
            if (num > 0) {
                System.out.print(num + " is Positive");
                if (num % 2 == 0) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("Comparison of first and last element: ");
        if (first > last) {
            System.out.println("First is greater than Last.");
        } else if (first < last) {
            System.out.println("First is less than Last.");
        } else { System.out.println("First is equal to Last.");
		}

        scanner.close();
    }
}
