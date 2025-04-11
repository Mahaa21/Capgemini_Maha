import java.util.Scanner;
public class Athlete{
public static double athlete(float side1, float side2, float side3){
	int dist = 5000;
return dist/(side1 + side2 + side3);
}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the side 1: ");
float side1 = scanner.nextFloat();
System.out.print("Enter the side 2: ");
float side2 = scanner.nextFloat();
System.out.print("Enter the side 3: ");
float side3 = scanner.nextFloat();
double atheleterun = athlete(side1, side2, side3);
System.out.println("The number of rounds user need to complete 5 KM run is " + atheleterun); 



}}