import java.util.Scanner;
class RocketLaunchFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();
		for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
		System.out.println("The rocket launched!");
    }
}
