import java.util.Scanner;
public class Average{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter num1:");
int num1 = scanner.nextInt();
System.out.println("Enter num2:");
int num2 = scanner.nextInt();
System.out.println("Enter num3:");
int num3 = scanner.nextInt();
double average = (num1 + num2 + num3) /3;
System.out.println("Average:" + average);
scanner.close();
}}
