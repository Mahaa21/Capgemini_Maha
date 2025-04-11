import java.util.Scanner;
public class FeetYardMile{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the distance in feets:");
float feet = scanner.nextFloat();
double yard = feet/3;
double mile = yard/1760;
System.out.println("The distance in feet is " + feet + " while in yard is " + yard + " and miles is " + mile);}}

