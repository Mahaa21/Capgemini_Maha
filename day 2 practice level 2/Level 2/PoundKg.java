import java.util.Scanner;
public class PoundKg{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Weight in kg:");
double weight = scanner.nextDouble();
double pound = weight / 2.2;
System.out.println("The weight of the person in pound is " + pound + " and in kg is " + weight);
scanner.close();
}}
