import java.util.Scanner;
public class AthleteRun{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter side1: ");
			int side1 = scanner.nextInt();
			System.out.print("Enter side2: ");
			int side2 = scanner.nextInt();
			System.out.print("Enter side3: ");
			int side3 = scanner.nextInt();
			int distance = 5000; //km to m conversion
			int perimeter = side1 + side2 + side3;
			int round = distance/perimeter;
			System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km." );
			scanner.close();
			
		}
	}
	

      