import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] marks = new int[numStudents][3]; // For Physics, Chemistry, Maths
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        String[] remarks = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] >= 0) break;
                    System.out.println("Marks cannot be negative. Please enter again:");
                }
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentages[i] >= 80) {
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
                remarks[i] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }
        System.out.println("\nStudent Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-50s\n", "Student", "Physics", "Chemistry", "Maths", "%", "Grade", "Remarks");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c %-50s\n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i], remarks[i]);
        }
    }
}
