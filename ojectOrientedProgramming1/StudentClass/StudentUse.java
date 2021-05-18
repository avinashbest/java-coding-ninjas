package ojectOrientedProgramming1.StudentClass;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Avinash Kumar";
        s1.rollNumber = 191041;
        System.out.println("Name: " + s1.name + " Roll No.: " + s1.rollNumber);

        s2.name = "Abhishek Rawe";
        s2.rollNumber = 191012;
        System.out.println("Name: " + s2.name + " Roll No.: " + s2.rollNumber);
    }
}
