import java.util.Scanner;
public class SumNatural{
public static int sumnat(int n){
	int sum = 0;
	for(int i=0; i<=n; i++){
		sum += i;}
	return sum;
	
	}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number: ");
int num = scanner.nextInt();
int result = sumnat(num);
	System.out.println("Sum of " + num + " natural numbers is " + result);


}}