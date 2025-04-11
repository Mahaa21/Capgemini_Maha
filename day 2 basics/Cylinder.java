import java.util.Scanner;
public class Cylinder{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Radius of Cylinder:");
double radius = scanner.nextDouble();
System.out.println("Enter Height of Cylinder:");
double height = scanner.nextDouble();
double volume = 3.14 * radius * radius * height;
System.out.println("Volume:" + volume);
scanner.close();
}}
