import java.util.Scanner;
public class HandShakes{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter number of students:");
int stud = scanner.nextInt();
int comb = (stud * (stud-1))/2;
System.out.println("The number of possible handshakes " + comb);
scanner.close();
}}
