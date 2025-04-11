import java.util.Scanner;
public class Area{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter radius of circle:");
	double radius = scanner.nextDouble();
	double area = 3.14*radius*radius;
	System.out.println("Area:" + area);
	scanner.close();}
	}