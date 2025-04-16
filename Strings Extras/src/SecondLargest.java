import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int secondLargest = array[0];

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest element is: " + secondLargest);

        scanner.close();
    }
}
