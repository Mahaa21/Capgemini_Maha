import java.util.*;
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayEmployee() {
        System.out.println("   Employee Name: " + name + ", Role: " + role);
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        Employee emp = new Employee(name, role);
        employees.add(emp);
    }

    public void displayDepartment() {
        System.out.println(" Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }

    public void clearEmployees() {
        employees.clear();
        System.out.println("   All employees removed from " + deptName);
    }
}

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    public void shutDownCompany() {
        System.out.println("\nShutting down company: " + companyName);
        for (Department d : departments) {
            d.clearEmployees();
        }
        departments.clear();
        System.out.println("All departments removed. Company shut down.");
    }
}

public class CompanyComposition {
    public static void main(String[] args) {
        Company techCorp = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee("Alice", "Software Engineer");
        dev.addEmployee("Bob", "Backend Developer");

        Department hr = new Department("Human Resources");
        hr.addEmployee("Charlie", "HR Manager");
        hr.addEmployee("Diana", "Recruiter");

        techCorp.addDepartment(dev);
        techCorp.addDepartment(hr);

        System.out.println("---- Company Structure ----");
        techCorp.displayCompanyStructure();

        techCorp.shutDownCompany();
    }
}
