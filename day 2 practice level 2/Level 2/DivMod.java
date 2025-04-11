import java.util.Scanner;
public class DivMod{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number:");
int num1 = scanner.nextInt();
System.out.println("Enter another number:");
int num2 = scanner.nextInt();
int div = num1 / num2;
int mod = num1 % num2;
System.out.println("The Quotient is " + div + " and Reminder is " +  mod + " of two number " + num1 + " and " + num2);}}

