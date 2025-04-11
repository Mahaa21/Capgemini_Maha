import java.util.Scanner;
public class Rectangle{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Length of Rectangle:");
double length = scanner.nextDouble();
System.out.println("Enter Width of Cylinder:");
double width = scanner.nextDouble();
double perimeter = 2 * (length+width);
System.out.println("Perimeter of Rectangle:" + perimeter);
scanner.close();
}}
