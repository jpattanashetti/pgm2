package pgm2;

public class Course extends Student {
    int sem;
    int marks;
    String sub;
    Course(String name, int age, String dob, int sem, int marks, String sub) {
        super(name, age, dob);
        this.sem = sem;
        this.marks = marks;
        this.sub = sub;
    }
    public void displayCourse() {
        super.displayStudent();
        System.out.println("Semester: " + sem);
        System.out.println("Marks: " + marks);
        System.out.println("Subject: " + sub);
    }
    public static void main(String[] args) {
        Course course1 = new Course("John Doe", 20, "01/01/2003", 2, 85, "Mathematics");
        course1.displayCourse();
        
        Course course2 = new Course("Jane Smith", 22, "02/02/2001", 3, 90, "Physics");
        course2.displayCourse();
    }
}
