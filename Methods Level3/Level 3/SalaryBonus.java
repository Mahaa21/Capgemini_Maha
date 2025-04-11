import java.util.Random;

public class SalaryBonus {
    public static void main(String[] args) {
        int employees = 10;
        double[][] employeeData = generateEmployeeData(employees);
        double[][] updatedData = calculateBonus(employeeData);
        displayResults(employeeData, updatedData);
    }

    public static double[][] generateEmployeeData(int employees) {
        Random random = new Random();
        double[][] data = new double[employees][2]; 

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); 
            data[i][1] = random.nextInt(11); 
        }
        return data;
    }
	public static double[][] calculateBonus(double[][] data) {
        int employees = data.length;
        double[][] updatedData = new double[employees][2]; 

        for (int i = 0; i < employees; i++) {
            double salary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            updatedData[i][0] = salary + bonus; 
            updatedData[i][1] = bonus; 
        }
        return updatedData;
    }

    public static void displayResults(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-5s %-15s %-10s %-15s %-10s\n", "ID", "Old Salary", "Years", "New Salary", "Bonus");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%-5d %-15.2f %-10.0f %-15.2f %-10.2f\n", 
                              i + 1, oldData[i][0], oldData[i][1], newData[i][0], newData[i][1]);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("Total: %-15.2f %-10s %-15.2f %-10.2f\n", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
