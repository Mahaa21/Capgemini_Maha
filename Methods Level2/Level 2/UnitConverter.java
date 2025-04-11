import java.util.Scanner;

public class UnitConverter{
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
	public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		System.out.print("Enter celsius: ");
		double celsius = scanner.nextDouble();
		System.out.print("Enter pounds: ");
		double pounds = scanner.nextDouble();
		System.out.print("Enter kilograms: ");
		double kilograms = scanner.nextDouble();
		System.out.print("Enter gallons: ");
		double gallons = scanner.nextDouble();
		System.out.print("Enter liters: ");
		double liters = scanner.nextDouble();
		
        System.out.println(fahrenheit + "°F to Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        System.out.println(celsius + "°C to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        System.out.println(pounds + " lbs to kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println(kilograms + " kg to pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println(gallons + " gallons to liters: " + convertGallonsToLiters(gallons));
        System.out.println(liters + " liters to gallons: " + convertLitersToGallons(liters));
    }
}
