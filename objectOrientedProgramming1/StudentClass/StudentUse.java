package objectOrientedProgramming1.StudentClass;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student(scan.next(), scan.nextInt());
        Student s2 = new Student(scan.next(), scan.nextInt());
        Student s3 = new Student(scan.next(), scan.nextInt());
        System.out.println(Student.getNumberOfTotalStudents());
    }
}
