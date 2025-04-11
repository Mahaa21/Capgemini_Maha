import java.util.Scanner;
public class ChocChild{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("No. of Chocolates: ");
			int choc = scanner.nextInt();
			System.out.print("No. of Children: ");
			int children = scanner.nextInt();
			System.out.print("Enter side3: ");
			int get = choc / children;
			int rem = choc % children;
			System.out.println("The number of chocolates each child gets is " + get + " and the number of remaining chocolates are " + rem );
			scanner.close();
			
		}
	}
	

      