package ojectOrientedProgramming1.StudentClass;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student(scan.nextLine(), scan.nextInt());
        s1.print();
        Student s2 = new Student(scan.nextLine());
        s2.print();

    }
}
