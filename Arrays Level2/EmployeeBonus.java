import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            while (true) {
                System.out.print("Enter salary: ");
                salary[i] = scanner.nextDouble();
                System.out.print("Enter years of service: ");
                yearsOfService[i] = scanner.nextDouble();
                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter again.");
                }
            }
        }
        for (int i = 0; i < EMPLOYEES; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonus[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\n--- Bonus Summary ---");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Total Payout ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        scanner.close();
    }
}
