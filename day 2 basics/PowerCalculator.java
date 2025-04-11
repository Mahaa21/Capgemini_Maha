import java.util.Scanner;
public class PowerCalculator{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Base Value:");
double base = scanner.nextDouble();
System.out.println("Enter Exponent:");
double exponent = scanner.nextDouble();
double power = Math.pow(base,exponent);
System.out.println("Power Calculation:" + power);
scanner.close();
}}
