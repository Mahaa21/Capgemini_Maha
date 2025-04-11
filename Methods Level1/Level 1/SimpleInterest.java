import java.util.Scanner;
public class SimpleInterest{
public static double simpint(double principal, double rate, double time){
return (principal*rate*time)/100;
}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter Principal amount:");
double principalamt = scanner.nextDouble();

System.out.print("Enter Rate:");
double rateperc = scanner.nextDouble();

System.out.print("Enter Time:");
double time = scanner.nextDouble();

double calculateSI = simpint(principalamt, rateperc, time);
System.out.println("The Simple Interest is " + calculateSI + " for principal " + principalamt + ", Rate of Interest " + rateperc + " and Time " + time); 



}}