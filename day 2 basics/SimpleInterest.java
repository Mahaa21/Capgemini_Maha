import java.util.Scanner;
public class SimpleInterest{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Principal Amount:");
double principal = scanner.nextDouble();
System.out.println("Enter Rate:");
double rate = scanner.nextDouble();
System.out.println("Enter Time:");
double time = scanner.nextDouble();
double simpleInterest = (principal * rate * time )/100;
System.out.println("Simple Interest:" + simpleInterest);
scanner.close();
}}
