import java.util.Scanner;

public class SumInteger {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);{
			System.out.println("Welcome to Bridgelabz!");
			System.out.println("Enter an integer");
			int num1 = scanner.nextInt();
			System.out.println("Enter another integer");
			int num2 = scanner.nextInt();
			int sum = num1 + num2;
			System.out.println("Sum:" + (sum));
			scanner.close();
			
		}
    }
}
