package pgm2;
public class Student {
    String name;
    int age;
    String dob;
    Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dob);
    }
}