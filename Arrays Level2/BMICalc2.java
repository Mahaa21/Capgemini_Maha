import java.util.Scanner;
public class BMICalc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmiValues = new double[n];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            heights[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            bmiValues[i] = weights[i] / (heights[i] * heights[i]); 
            if (bmiValues[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatus[i] = "Normal Weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nBMI Details:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Weight Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmiValues[i], weightStatus[i]);
        }

        scanner.close();
    }
}
