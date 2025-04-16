import java.util.*;

class Cour {
    private String courseName;
    private Prof professor;
    private List<Stud> students;

    public Cour(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Prof professor) {
        this.professor = professor;
    }

    public void enrollStudent(Stud student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students:");
        for (Stud s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

class Stud {
    private String name;
    private List<Cour> courses;

    public Stud(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Cour course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Cour c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}

class Prof {
    private String name;

    public Prof(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {

        Prof p1 = new Prof("Dr. Smith");
        Prof p2 = new Prof("Dr. Johnson");
        Cour c1 = new Cour("Mathematics");
        Cour c2 = new Cour("Computer Science");
        c1.assignProfessor(p1);
        c2.assignProfessor(p2);
        Stud s1 = new Stud("Alice");
        Stud s2 = new Stud("Bob");
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();
        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
