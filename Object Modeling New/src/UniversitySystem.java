import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dept {
    private String deptName;

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class University {
    private String uniName;
    private List<Dept> departments;

    public University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Dept(deptName));
    }

    public void showDepartments() {
        System.out.println("Departments in " + uniName + ":");
        for (Dept d : departments) {
            System.out.println(" - " + d.getDeptName());
        }
    }

    public void deleteUniversity() {
        departments.clear();
        System.out.println(uniName + " and its departments are deleted.");
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University uni = new University("Oxford University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Physics");
        uni.addDepartment("Mathematics");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Alice");

        System.out.println("Independent Faculty:");
        System.out.println(" - " + f1.getName());
        System.out.println(" - " + f2.getName());

        System.out.println("\nUniversity Structure:");
        uni.showDepartments();

        System.out.println("\nDeleting University...");
        uni.deleteUniversity();
    }
}
