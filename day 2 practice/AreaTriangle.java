import java.util.Scanner;
public class AreaTriangle{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the base:");
float base = scanner.nextFloat();
System.out.println("Enter the height:");
float height = scanner.nextFloat();
double areaCm = 0.5 * base * height;
double areaInch = areaCm * 0.155;
double areaFeet = areaInch / 144;
System.out.println("Your Area in cm is " + areaCm + " while in feet is " + areaFeet + " and inches is " + areaInch);}}

