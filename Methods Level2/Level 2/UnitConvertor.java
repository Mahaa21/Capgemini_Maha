import java.util.Scanner;
public class UnitConvertor{
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }
	public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
	public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
	public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
	public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter yards: ");
		double yards = scanner.nextDouble();
		System.out.print("Enter feet: ");
		double feet = scanner.nextDouble();
		System.out.print("Enter meters: ");
		double meters = scanner.nextDouble();
		System.out.print("Enter inches: ");
		double inches = scanner.nextDouble();
		
        System.out.println(yards + " yards to feet: " + convertYardsToFeet(yards));
        System.out.println(feet + " feet to yards: " + convertFeetToYards(feet));
        System.out.println(meters + " meters to inches: " + convertMetersToInches(meters));
        System.out.println(inches + " inches to meters: " + convertInchesToMeters(inches));
        System.out.println(inches + " inches to centimeters: " + convertInchesToCentimeters(inches));
    }
}
