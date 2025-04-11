import java.util.Scanner;
public class KmMiles{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter distance in Kilometer:");
int km = scanner.nextInt();
double mile = km * 1.6;
System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
scanner.close();
}}
