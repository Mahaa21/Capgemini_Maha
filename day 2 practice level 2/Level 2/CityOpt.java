import java.util.Scanner;

public class CityOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter the final destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
		
        System.out.print("Enter the total time taken (in hours): ");
        double timeTaken = scanner.nextDouble();
        scanner.close();

        double totalDistance = fromToVia + viaToFinalCity;

        double avgSpeed = totalDistance / timeTaken;

        System.out.printf("Journey: %s → %s → %s%n", fromCity, viaCity, toCity);
        System.out.printf("Total Distance: %.2f miles%n", totalDistance);
        System.out.printf("Time Taken: %.2f hours%n", timeTaken);
        System.out.printf("Average Speed: %.2f miles per hour%n", avgSpeed);
    }
}
