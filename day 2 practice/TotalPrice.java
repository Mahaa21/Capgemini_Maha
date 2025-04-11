import java.util.Scanner;
public class TotalPrice{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter UnitPrice:");
float unitprice = scanner.nextFloat();
System.out.println("Enter Quantity:");
float quantity = scanner.nextFloat();
double totalprice = unitprice * quantity;
System.out.println("The total purchase price is INR " + totalprice + " if the quantity " + quantity + " and unit price is INR " + unitprice);
scanner.close();
}}
