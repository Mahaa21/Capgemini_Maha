import java.util.Scanner;
public class StudentGrade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        int totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;
        String grade, remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalised standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalised standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalised standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalised standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalised standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        System.out.println("\n Result");
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
