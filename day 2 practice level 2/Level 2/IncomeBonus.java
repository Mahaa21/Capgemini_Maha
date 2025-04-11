import java.util.Scanner;
public class IncomeBonus{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Salary: ");
			float salary = scanner.nextFloat();
			System.out.print("Enter Bonus: ");
			float bonus = scanner.nextFloat();
			float income = salary + bonus;
			System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
			scanner.close();
			
		}
	}
	

      