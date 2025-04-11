import java.util.Scanner;
public class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter temperature in Fahrenheit: ");
			float fahrenheit = scanner.nextFloat();
			float celsius = (fahrenheit - 32) *5/9;
			System.out.println("The " + fahrenheit + " fahrenheit is " + celsius + " celsius" );
			scanner.close();
			
		}
	}
	

      