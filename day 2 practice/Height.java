import java.util.Scanner;
public class Height{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your Height:");
float height = scanner.nextFloat();
double inch = height / 2.54;
double foot = inch/12;
System.out.println("Your Height in cm is " + height + " while in feet is " + foot + " and inches is " + inch);}}

