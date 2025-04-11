import java.util.Scanner;
public class BMICalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in cm): ");
        double heightCm = scanner.nextDouble();
        scanner.close();
        double heightMeters = heightCm / 100;
        double bmi = weight / (heightMeters * heightMeters);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
    }
}
