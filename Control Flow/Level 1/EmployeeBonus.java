import java.util.Scanner;
class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;  
            System.out.println("You get a bonus of: $" + bonus);
        } else {
            System.out.println("No bonus awarded. Service must be more than 5 years.");
        }
    }
}
