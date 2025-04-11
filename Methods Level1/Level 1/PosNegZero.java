import java.util.Scanner;
public class PosNegZero{
public static int num(int n){
	if (n > 0){
		return 1;}
	else if (n<0){
		return -1;}
	else {
		return 0;}
}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number: ");
int number = scanner.nextInt();
int result = num(number);
if (result == 1){
	System.out.println("The number is Positive");
}
else if (result == -1){
	System.out.println("The number is Negative");
}
else{
	System.out.println("The number is Zero");

}


}}