import java.util.Scanner;
public class Discount2{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Student fee:");
double fees = scanner.nextDouble();
System.out.println("Enter University Discount:");
double discountperc = scanner.nextDouble();
double discount = fees*(discountperc/100);
double amount = fees - discount;
System.out.println("The discount amount is INR " + discount +  " and final discounted fee is INR " + amount);}}

