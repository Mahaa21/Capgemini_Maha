import java.util.Scanner;
public class KiloToMiles{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter distance as kilometer:");
double kilometer = scanner.nextDouble();
double miles = kilometer * 0.621371;
System.out.println("Miles:" + miles);
scanner.close();
}}
