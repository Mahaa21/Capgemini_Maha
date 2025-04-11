import java.util.Scanner;
public class HandShakes{
public static int handshake(int n){
return (n*(n-1))/2;
}

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter No. of Students: ");
int studnum = scanner.nextInt();

int combihandshake = handshake(studnum);
System.out.println("The maximum number of handshakes among " + studnum + " students is " + combihandshake); 



}}