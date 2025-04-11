import java.util.Scanner;
public class SpringSeason{
public static String season(int month, int day){
	if ((month == 3 && day >= 20) || (month > 3 && month <6) || (month == 6 && day<=20)){
	return "Its a Spring Season";} 
	else {
	return "Not a Spring Season";
	}
	}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the month ( 1-12): ");
int month = scanner.nextInt();
System.out.print("Enter the day ( 1-30): ");
int day = scanner.nextInt();

String result = season(month,day);
	System.out.println(result);


}}