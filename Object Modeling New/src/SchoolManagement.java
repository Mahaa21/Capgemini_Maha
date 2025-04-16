import java.util.*;
class Course {
    private String courseName;
    private List<Student> enrolledStudents;
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getCourseName() {
        return courseName;
    }
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}
class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        }
    }

    public void showEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course c : enrolledCourses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Course math = new Course("Mathematics");
        Course sci = new Course("Science");

        s1.enrollInCourse(math);
        s1.enrollInCourse(sci);
        s2.enrollInCourse(math);

        school.addStudent(s1);
        school.addStudent(s2);
        System.out.println("=== SCHOOL INFO ===");
        school.showAllStudents();

        System.out.println("\n=== STUDENT COURSES ===");
        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        System.out.println("\n=== COURSE STUDENTS ===");
        math.showEnrolledStudents();
        sci.showEnrolledStudents();
    }
}
